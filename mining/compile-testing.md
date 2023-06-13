# compile-testing 
 
# Bad smells
I found 141 bad smells with 14 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocReference | 88 | false |
| UnnecessaryModifier | 11 | true |
| OptionalUsedAsFieldOrParameterType | 8 | false |
| ConstantValue | 7 | false |
| RedundantTypeArguments | 4 | false |
| DataFlowIssue | 3 | false |
| NullableProblems | 3 | false |
| FieldMayBeFinal | 2 | false |
| UnnecessaryReturn | 2 | true |
| OptionalIsPresent | 1 | false |
| OptionalAssignedToNull | 1 | false |
| LoopConditionNotUpdatedInsideLoop | 1 | false |
| DeprecatedIsStillUsed | 1 | false |
| JavaReflectionMemberAccess | 1 | false |
| FinalMethodInFinalClass | 1 | false |
| ProtectedMemberInFinalClass | 1 | true |
| StringBufferReplaceableByString | 1 | false |
| Deprecation | 1 | false |
| FinalStaticMethod | 1 | false |
| ArraysAsListWithZeroOrOneArgument | 1 | false |
| TypeParameterExtendsObject | 1 | false |
| OptionalGetWithoutIsPresent | 1 | false |
## RuleId[id=OptionalUsedAsFieldOrParameterType]
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
`Optional` used as type for parameter 'generatedFile'
in `src/main/java/com/google/testing/compile/CompilationSubject.java`
#### Snippet
```java

  private JavaFileObjectSubject checkGeneratedFile(
      Optional<JavaFileObject> generatedFile, Location location, String path) {
    if (!generatedFile.isPresent()) {
      // TODO(b/132162475): Use Facts if it becomes public API.
```

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
  public interface CompilationWithNotesClause<T> {
    /**
     * Checks that a note exists that contains the given fragment in the
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
   * @param T the non-generic clause type implementing this interface
   */
  public interface CompilationWithWarningsClause<T> extends CompilationWithNotesClause<T> {

    /**
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
  public interface GeneratedPredicateClause<T> {
    /**
     * Checks that a source file with an equivalent
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
   * @param T the clause type returned by {@link ChainingClause#and()}
   */
  public interface LineClause<T> extends ChainingClause<T> {
    @CanIgnoreReturnValue
    ColumnClause<T> onLine(long lineNumber);
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

## RuleId[id=LoopConditionNotUpdatedInsideLoop]
### LoopConditionNotUpdatedInsideLoop
Variable 'node' is not updated inside loop
in `src/main/java/com/google/testing/compile/TreeContext.java`
#### Snippet
```java
  long getNodeEndPosition(Tree node) {
    TreePath currentNode = getNodePath(node);
    while (node != null) {
      long endPosition = sourcePositions.getEndPosition(compilationUnit, currentNode.getLeaf());
      if (endPosition != NOPOS) {
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `Compiler`
in `src/main/java/com/google/testing/compile/package-info.java`
#### Snippet
```java
 *
 * <ul>
 *   <li>{@link Compiler} lets you choose command-line options, annotation processors, and source
 *       files to compile.
 *   <li>{@link Compilation} represents the immutable result of compiling source files: diagnostics
```

### JavadocReference
Cannot resolve symbol `Compilation`
in `src/main/java/com/google/testing/compile/package-info.java`
#### Snippet
```java
 *   <li>{@link Compiler} lets you choose command-line options, annotation processors, and source
 *       files to compile.
 *   <li>{@link Compilation} represents the immutable result of compiling source files: diagnostics
 *       and generated files.
 *   <li>{@link CompilationSubject} lets you make assertions about {@link Compilation} objects.
```

### JavadocReference
Cannot resolve symbol `CompilationSubject`
in `src/main/java/com/google/testing/compile/package-info.java`
#### Snippet
```java
 *   <li>{@link Compilation} represents the immutable result of compiling source files: diagnostics
 *       and generated files.
 *   <li>{@link CompilationSubject} lets you make assertions about {@link Compilation} objects.
 *   <li>{@link JavaFileObjectSubject} lets you make assertions about {@link
 *       javax.tools.JavaFileObject} objects.
```

### JavadocReference
Cannot resolve symbol `Compilation`
in `src/main/java/com/google/testing/compile/package-info.java`
#### Snippet
```java
 *   <li>{@link Compilation} represents the immutable result of compiling source files: diagnostics
 *       and generated files.
 *   <li>{@link CompilationSubject} lets you make assertions about {@link Compilation} objects.
 *   <li>{@link JavaFileObjectSubject} lets you make assertions about {@link
 *       javax.tools.JavaFileObject} objects.
```

### JavadocReference
Cannot resolve symbol `JavaFileObjectSubject`
in `src/main/java/com/google/testing/compile/package-info.java`
#### Snippet
```java
 *       and generated files.
 *   <li>{@link CompilationSubject} lets you make assertions about {@link Compilation} objects.
 *   <li>{@link JavaFileObjectSubject} lets you make assertions about {@link
 *       javax.tools.JavaFileObject} objects.
 * </ul>
```

### JavadocReference
Cannot resolve symbol `javax.tools.Diagnostic.NOPOS`
in `src/main/java/com/google/testing/compile/TreeContext.java`
#### Snippet
```java
   * Returns start column of the given sub-{@code Tree} of this object's
   * {@code CompilationUnitTree}, climbing the associated {@code TreePath} until a value other than
   * {@link javax.tools.Diagnostic.NOPOS} is found.
   *
   * <p>This method will return {@link javax.tools.Diagnostic.NOPOS} if that value is returned
```

### JavadocReference
Cannot resolve symbol `javax.tools.Diagnostic.NOPOS`
in `src/main/java/com/google/testing/compile/TreeContext.java`
#### Snippet
```java
   * {@link javax.tools.Diagnostic.NOPOS} is found.
   *
   * <p>This method will return {@link javax.tools.Diagnostic.NOPOS} if that value is returned
   * by a call to {@link SourcePositions#getStartPosition} for every node in the {@link TreePath}
   * provided.
```

### JavadocReference
Cannot resolve symbol `SourcePositions`
in `src/main/java/com/google/testing/compile/TreeContext.java`
#### Snippet
```java
   *
   * <p>This method will return {@link javax.tools.Diagnostic.NOPOS} if that value is returned
   * by a call to {@link SourcePositions#getStartPosition} for every node in the {@link TreePath}
   * provided.
   *
```

### JavadocReference
Cannot resolve symbol `getStartPosition`
in `src/main/java/com/google/testing/compile/TreeContext.java`
#### Snippet
```java
   *
   * <p>This method will return {@link javax.tools.Diagnostic.NOPOS} if that value is returned
   * by a call to {@link SourcePositions#getStartPosition} for every node in the {@link TreePath}
   * provided.
   *
```

### JavadocReference
Cannot resolve symbol `TreePath`
in `src/main/java/com/google/testing/compile/TreeContext.java`
#### Snippet
```java
   *
   * <p>This method will return {@link javax.tools.Diagnostic.NOPOS} if that value is returned
   * by a call to {@link SourcePositions#getStartPosition} for every node in the {@link TreePath}
   * provided.
   *
```

### JavadocReference
Cannot resolve symbol `javax.tools.Diagnostic.NOPOS`
in `src/main/java/com/google/testing/compile/TreeContext.java`
#### Snippet
```java
   * Returns end column of the given sub-{@code Tree} of this object's {@code CompilationUnitTree}.
   * climbing the associated {@code TreePath} until a value other than
   * {@link javax.tools.Diagnostic.NOPOS} is found.
   *
   * <p>This method will return {@link javax.tools.Diagnostic.NOPOS} if that value is returned
```

### JavadocReference
Cannot resolve symbol `javax.tools.Diagnostic.NOPOS`
in `src/main/java/com/google/testing/compile/TreeContext.java`
#### Snippet
```java
   * {@link javax.tools.Diagnostic.NOPOS} is found.
   *
   * <p>This method will return {@link javax.tools.Diagnostic.NOPOS} if that value is returned
   * by a call to {@link SourcePositions#getEndPosition} for every node in the {@link TreePath}
   * provided.
```

### JavadocReference
Cannot resolve symbol `SourcePositions`
in `src/main/java/com/google/testing/compile/TreeContext.java`
#### Snippet
```java
   *
   * <p>This method will return {@link javax.tools.Diagnostic.NOPOS} if that value is returned
   * by a call to {@link SourcePositions#getEndPosition} for every node in the {@link TreePath}
   * provided.
   *
```

### JavadocReference
Cannot resolve symbol `getEndPosition`
in `src/main/java/com/google/testing/compile/TreeContext.java`
#### Snippet
```java
   *
   * <p>This method will return {@link javax.tools.Diagnostic.NOPOS} if that value is returned
   * by a call to {@link SourcePositions#getEndPosition} for every node in the {@link TreePath}
   * provided.
   *
```

### JavadocReference
Cannot resolve symbol `TreePath`
in `src/main/java/com/google/testing/compile/TreeContext.java`
#### Snippet
```java
   *
   * <p>This method will return {@link javax.tools.Diagnostic.NOPOS} if that value is returned
   * by a call to {@link SourcePositions#getEndPosition} for every node in the {@link TreePath}
   * provided.
   *
```

### JavadocReference
Cannot resolve symbol `javax.tools.Diagnostic.NOPOS`
in `src/main/java/com/google/testing/compile/TreeContext.java`
#### Snippet
```java
   * Returns start line of the given sub-{@code Tree} of this object's {@code CompilationUnitTree},
   * climbing the associated {@code TreePath} until a value other than
   * {@link javax.tools.Diagnostic.NOPOS} is found.
   *
   * <p>This method will return {@link javax.tools.Diagnostic.NOPOS} if that value is returned
```

### JavadocReference
Cannot resolve symbol `javax.tools.Diagnostic.NOPOS`
in `src/main/java/com/google/testing/compile/TreeContext.java`
#### Snippet
```java
   * {@link javax.tools.Diagnostic.NOPOS} is found.
   *
   * <p>This method will return {@link javax.tools.Diagnostic.NOPOS} if that value is returned
   * by a call to {@link SourcePositions#getStartPosition} for every node in the {@link TreePath}
   * provided.
```

### JavadocReference
Cannot resolve symbol `SourcePositions`
in `src/main/java/com/google/testing/compile/TreeContext.java`
#### Snippet
```java
   *
   * <p>This method will return {@link javax.tools.Diagnostic.NOPOS} if that value is returned
   * by a call to {@link SourcePositions#getStartPosition} for every node in the {@link TreePath}
   * provided.
   *
```

### JavadocReference
Cannot resolve symbol `getStartPosition`
in `src/main/java/com/google/testing/compile/TreeContext.java`
#### Snippet
```java
   *
   * <p>This method will return {@link javax.tools.Diagnostic.NOPOS} if that value is returned
   * by a call to {@link SourcePositions#getStartPosition} for every node in the {@link TreePath}
   * provided.
   *
```

### JavadocReference
Cannot resolve symbol `TreePath`
in `src/main/java/com/google/testing/compile/TreeContext.java`
#### Snippet
```java
   *
   * <p>This method will return {@link javax.tools.Diagnostic.NOPOS} if that value is returned
   * by a call to {@link SourcePositions#getStartPosition} for every node in the {@link TreePath}
   * provided.
   *
```

### JavadocReference
Cannot resolve symbol `javax.tools.Diagnostic.NOPOS`
in `src/main/java/com/google/testing/compile/TreeContext.java`
#### Snippet
```java
   * Returns start position of the given sub-{@code Tree} of this object's
   * {@code CompilationUnitTree}, climbing the associated {@code TreePath} until a value other than
   * {@link javax.tools.Diagnostic.NOPOS} is found.
   *
   * <p>This method will return {@link javax.tools.Diagnostic.NOPOS} if that value is returned
```

### JavadocReference
Cannot resolve symbol `javax.tools.Diagnostic.NOPOS`
in `src/main/java/com/google/testing/compile/TreeContext.java`
#### Snippet
```java
   * {@link javax.tools.Diagnostic.NOPOS} is found.
   *
   * <p>This method will return {@link javax.tools.Diagnostic.NOPOS} if that value is returned
   * by a call to {@link SourcePositions#getStartPosition} for every node in the {@link TreePath}
   * provided.
```

### JavadocReference
Cannot resolve symbol `SourcePositions`
in `src/main/java/com/google/testing/compile/TreeContext.java`
#### Snippet
```java
   *
   * <p>This method will return {@link javax.tools.Diagnostic.NOPOS} if that value is returned
   * by a call to {@link SourcePositions#getStartPosition} for every node in the {@link TreePath}
   * provided.
   *
```

### JavadocReference
Cannot resolve symbol `getStartPosition`
in `src/main/java/com/google/testing/compile/TreeContext.java`
#### Snippet
```java
   *
   * <p>This method will return {@link javax.tools.Diagnostic.NOPOS} if that value is returned
   * by a call to {@link SourcePositions#getStartPosition} for every node in the {@link TreePath}
   * provided.
   *
```

### JavadocReference
Cannot resolve symbol `TreePath`
in `src/main/java/com/google/testing/compile/TreeContext.java`
#### Snippet
```java
   *
   * <p>This method will return {@link javax.tools.Diagnostic.NOPOS} if that value is returned
   * by a call to {@link SourcePositions#getStartPosition} for every node in the {@link TreePath}
   * provided.
   *
```

### JavadocReference
Cannot resolve symbol `javax.tools.Diagnostic.NOPOS`
in `src/main/java/com/google/testing/compile/TreeContext.java`
#### Snippet
```java
   * Returns end position of the given sub-{@code Tree} of this object's
   * {@code CompilationUnitTree}, climbing the associated {@code TreePath} until a value other than
   * {@link javax.tools.Diagnostic.NOPOS} is found.
   *
   * <p>This method will return {@link javax.tools.Diagnostic.NOPOS} if that value is returned
```

### JavadocReference
Cannot resolve symbol `javax.tools.Diagnostic.NOPOS`
in `src/main/java/com/google/testing/compile/TreeContext.java`
#### Snippet
```java
   * {@link javax.tools.Diagnostic.NOPOS} is found.
   *
   * <p>This method will return {@link javax.tools.Diagnostic.NOPOS} if that value is returned
   * by a call to {@link SourcePositions#getEndPosition} for every node in the {@link TreePath}
   * provided.
```

### JavadocReference
Cannot resolve symbol `SourcePositions`
in `src/main/java/com/google/testing/compile/TreeContext.java`
#### Snippet
```java
   *
   * <p>This method will return {@link javax.tools.Diagnostic.NOPOS} if that value is returned
   * by a call to {@link SourcePositions#getEndPosition} for every node in the {@link TreePath}
   * provided.
   *
```

### JavadocReference
Cannot resolve symbol `getEndPosition`
in `src/main/java/com/google/testing/compile/TreeContext.java`
#### Snippet
```java
   *
   * <p>This method will return {@link javax.tools.Diagnostic.NOPOS} if that value is returned
   * by a call to {@link SourcePositions#getEndPosition} for every node in the {@link TreePath}
   * provided.
   *
```

### JavadocReference
Cannot resolve symbol `TreePath`
in `src/main/java/com/google/testing/compile/TreeContext.java`
#### Snippet
```java
   *
   * <p>This method will return {@link javax.tools.Diagnostic.NOPOS} if that value is returned
   * by a call to {@link SourcePositions#getEndPosition} for every node in the {@link TreePath}
   * provided.
   *
```

### JavadocReference
Cannot resolve symbol `javax.tools.Diagnostic.NOPOS`
in `src/main/java/com/google/testing/compile/TreeContext.java`
#### Snippet
```java
   * Returns end line of the given sub-{@code Tree} of this object's {@code CompilationUnitTree}.
   * climbing the associated {@code TreePath} until a value other than
   * {@link javax.tools.Diagnostic.NOPOS} is found.
   *
   * <p>This method will return {@link javax.tools.Diagnostic.NOPOS} if that value is returned
```

### JavadocReference
Cannot resolve symbol `javax.tools.Diagnostic.NOPOS`
in `src/main/java/com/google/testing/compile/TreeContext.java`
#### Snippet
```java
   * {@link javax.tools.Diagnostic.NOPOS} is found.
   *
   * <p>This method will return {@link javax.tools.Diagnostic.NOPOS} if that value is returned
   * by a call to {@link SourcePositions#getEndPosition} for every node in the {@link TreePath}
   * provided.
```

### JavadocReference
Cannot resolve symbol `SourcePositions`
in `src/main/java/com/google/testing/compile/TreeContext.java`
#### Snippet
```java
   *
   * <p>This method will return {@link javax.tools.Diagnostic.NOPOS} if that value is returned
   * by a call to {@link SourcePositions#getEndPosition} for every node in the {@link TreePath}
   * provided.
   *
```

### JavadocReference
Cannot resolve symbol `getEndPosition`
in `src/main/java/com/google/testing/compile/TreeContext.java`
#### Snippet
```java
   *
   * <p>This method will return {@link javax.tools.Diagnostic.NOPOS} if that value is returned
   * by a call to {@link SourcePositions#getEndPosition} for every node in the {@link TreePath}
   * provided.
   *
```

### JavadocReference
Cannot resolve symbol `TreePath`
in `src/main/java/com/google/testing/compile/TreeContext.java`
#### Snippet
```java
   *
   * <p>This method will return {@link javax.tools.Diagnostic.NOPOS} if that value is returned
   * by a call to {@link SourcePositions#getEndPosition} for every node in the {@link TreePath}
   * provided.
   *
```

### JavadocReference
Cannot resolve symbol `TreeScanner`
in `src/main/java/com/google/testing/compile/TypeEnumerator.java`
#### Snippet
```java
  }

  /** A {@link TreeScanner} for determining type declarations */
  @SuppressWarnings("restriction") // Sun APIs usage intended
  static final class TypeScanner extends TreeScanner<Set<String>, @Nullable Void> {
```

### JavadocReference
Cannot resolve symbol `TreePath`
in `src/main/java/com/google/testing/compile/Breadcrumbs.java`
#### Snippet
```java

  /**
   * Returns a list of breadcrumb strings describing the {@link TreePath} given.
   */
  static List<String> getBreadcrumbList(TreePath path) {
```

### JavadocReference
Cannot resolve symbol `SimpleTreeVisitor`
in `src/main/java/com/google/testing/compile/Breadcrumbs.java`
#### Snippet
```java

  /**
   * A {@link SimpleTreeVisitor} for providing a breadcrumb {@code String} for a {@link Tree} node.
   * The breadcrumb {@code String} will not be unique, but can be used to give context about the
   * node as it exists within a {@code TreePath}.
```

### JavadocReference
Cannot resolve symbol `Tree`
in `src/main/java/com/google/testing/compile/Breadcrumbs.java`
#### Snippet
```java

  /**
   * A {@link SimpleTreeVisitor} for providing a breadcrumb {@code String} for a {@link Tree} node.
   * The breadcrumb {@code String} will not be unique, but can be used to give context about the
   * node as it exists within a {@code TreePath}.
```

### JavadocReference
Cannot resolve symbol `TreePath`
in `src/main/java/com/google/testing/compile/Breadcrumbs.java`
#### Snippet
```java

  /**
   * Returns a string describing the {@link TreePath} given.
   */
  static String describeTreePath(TreePath path) {
```

### JavadocReference
Cannot resolve symbol `T`
in `src/main/java/com/google/testing/compile/CompileTester.java`
#### Snippet
```java
   * {@link JavaFileObject}.
   *
   * @param T the clause type returned by {@link ChainingClause#and()}
   */
  public interface FileClause<T> extends ChainingClause<T> {
```

### JavadocReference
Cannot resolve symbol `T`
in `src/main/java/com/google/testing/compile/CompileTester.java`
#### Snippet
```java
   * The clause in the fluent API that checks notes in a compilation.
   *
   * @param T the non-generic clause type implementing this interface
   */
  public interface CompilationWithNotesClause<T> {
```

### JavadocReference
Cannot resolve symbol `T`
in `src/main/java/com/google/testing/compile/CompileTester.java`
#### Snippet
```java
   * The clause in the fluent API that allows for chaining test conditions.
   *
   * @param T the clause type returned by {@link #and()}
   */
  public interface ChainingClause<T> {
```

### JavadocReference
Cannot resolve symbol `T`
in `src/main/java/com/google/testing/compile/CompileTester.java`
#### Snippet
```java
   * The clause in the fluent API that checks notes and warnings in a compilation.
   *
   * @param T the non-generic clause type implementing this interface
   */
  public interface CompilationWithWarningsClause<T> extends CompilationWithNotesClause<T> {
```

### JavadocReference
Cannot resolve symbol `T`
in `src/main/java/com/google/testing/compile/CompileTester.java`
#### Snippet
```java
   * The clause in the fluent API that checks that a generated file has the specified contents.
   *
   * @param T the non-generic clause type implementing this interface
   */
  public interface SuccessfulFileClause<T> extends ChainingClause<GeneratedPredicateClause<T>> {
```

### JavadocReference
Cannot resolve symbol `T`
in `src/main/java/com/google/testing/compile/CompileTester.java`
#### Snippet
```java
   * The clause in the fluent API that checks that files were generated.
   *
   * @param T the non-generic clause type implementing this interface
   */
  public interface GeneratedPredicateClause<T> {
```

### JavadocReference
Cannot resolve symbol `T`
in `src/main/java/com/google/testing/compile/CompileTester.java`
#### Snippet
```java
   * {@linkplain Diagnostic#getColumnNumber() column}.
   *
   * @param T the clause type returned by {@link ChainingClause#and()}
   */
  public interface ColumnClause<T> extends ChainingClause<T> {
```

### JavadocReference
Cannot resolve symbol `T`
in `src/main/java/com/google/testing/compile/CompileTester.java`
#### Snippet
```java
   * {@linkplain Diagnostic#getLineNumber() line}.
   *
   * @param T the clause type returned by {@link ChainingClause#and()}
   */
  public interface LineClause<T> extends ChainingClause<T> {
```

### JavadocReference
Cannot resolve symbol `Tree.Kind`
in `src/main/java/com/google/testing/compile/MoreTrees.java`
#### Snippet
```java

  /**
   * Finds a TreePath terminating at the first instance of the given {@link Tree.Kind} that is a
   * subtree of the root provided and which matches the optional identifier string.
   *
```

### JavadocReference
Cannot resolve symbol `Tree`
in `src/main/java/com/google/testing/compile/MoreTrees.java`
#### Snippet
```java
   * subtree of the root provided and which matches the optional identifier string.
   *
   * <p>Identifier strings are only valid for some {@link Tree} and may take different meanings. The
   * following list provides a quick summary of the matching behavior:
   * <ul>
```

### JavadocReference
Cannot resolve symbol `Tree`
in `src/main/java/com/google/testing/compile/MoreTrees.java`
#### Snippet
```java
   * following list provides a quick summary of the matching behavior:
   * <ul>
   * <li>{@link Tree}s with kind {@code BREAK}, {@code CONTINUE}, and {@code LABELED_STATEMENT}
   * match on their {@code getLabel()} methods.
   * <li>{@link Tree}s with kind {@code ANNOTATION_TYPE}, {@code CLASS}, {@code ENUM},
```

### JavadocReference
Cannot resolve symbol `Tree`
in `src/main/java/com/google/testing/compile/MoreTrees.java`
#### Snippet
```java
   * <li>{@link Tree}s with kind {@code BREAK}, {@code CONTINUE}, and {@code LABELED_STATEMENT}
   * match on their {@code getLabel()} methods.
   * <li>{@link Tree}s with kind {@code ANNOTATION_TYPE}, {@code CLASS}, {@code ENUM},
   * and {@code INTERFACE} match on their {@code getSimpleName()} method.
   * <li>{@link Tree}s with kind {@code *_LITERAL} match on their {@code getValue()} method.
```

### JavadocReference
Cannot resolve symbol `Tree`
in `src/main/java/com/google/testing/compile/MoreTrees.java`
#### Snippet
```java
   * <li>{@link Tree}s with kind {@code ANNOTATION_TYPE}, {@code CLASS}, {@code ENUM},
   * and {@code INTERFACE} match on their {@code getSimpleName()} method.
   * <li>{@link Tree}s with kind {@code *_LITERAL} match on their {@code getValue()} method.
   * <li>{@link Tree}s with kind {@code IDENTIFIER}, {@code METHOD}, and {@code TYPE_PARAMETER}
   * match on their {@code getName()} method.
```

### JavadocReference
Cannot resolve symbol `Tree`
in `src/main/java/com/google/testing/compile/MoreTrees.java`
#### Snippet
```java
   * and {@code INTERFACE} match on their {@code getSimpleName()} method.
   * <li>{@link Tree}s with kind {@code *_LITERAL} match on their {@code getValue()} method.
   * <li>{@link Tree}s with kind {@code IDENTIFIER}, {@code METHOD}, and {@code TYPE_PARAMETER}
   * match on their {@code getName()} method.
   * <li>{@link Tree}s with kind {@code MEMBER_SELECT} matches on their {@code getIdentifier()}
```

### JavadocReference
Cannot resolve symbol `Tree`
in `src/main/java/com/google/testing/compile/MoreTrees.java`
#### Snippet
```java
   * <li>{@link Tree}s with kind {@code IDENTIFIER}, {@code METHOD}, and {@code TYPE_PARAMETER}
   * match on their {@code getName()} method.
   * <li>{@link Tree}s with kind {@code MEMBER_SELECT} matches on their {@code getIdentifier()}
   * method.
   *
```

### JavadocReference
Cannot resolve symbol `Tree.Kind`
in `src/main/java/com/google/testing/compile/MoreTrees.java`
#### Snippet
```java

  /**
   * Finds the first instance of the given {@link Tree.Kind} that is a subtree of the root provided
   * and which matches identifier string.
   *
```

### JavadocReference
Cannot resolve symbol `Tree.Kind`
in `src/main/java/com/google/testing/compile/MoreTrees.java`
#### Snippet
```java

  /**
   * Finds the first instance of the given {@link Tree.Kind} that is a subtree of the root provided.
   *
   * @throws IllegalArgumentException if no such subtree exists.
```

### JavadocReference
Cannot resolve symbol `Tree.Kind`
in `src/main/java/com/google/testing/compile/MoreTrees.java`
#### Snippet
```java

  /**
   * Finds a path to the first instance of the given {@link Tree.Kind} that is a subtree of the root
   * provided.
   *
```

### JavadocReference
Cannot resolve symbol `CompilationUnitTree`
in `src/main/java/com/google/testing/compile/MoreTrees.java`
#### Snippet
```java
final class MoreTrees {

  /** Parses the source given into a {@link CompilationUnitTree}. */
  static CompilationUnitTree parseLinesToTree(String... source) {
    return parseLinesToTree(Arrays.asList(source));
```

### JavadocReference
Cannot resolve symbol `TreePathScanner`
in `src/main/java/com/google/testing/compile/MoreTrees.java`
#### Snippet
```java
  }

  /** A {@link TreePathScanner} to power the subtree searches in this class */
  static final class SearchScanner extends TreePathScanner<Optional<TreePath>, @Nullable Void> {
    private final Optional<String> identifier;
```

### JavadocReference
Cannot resolve symbol `CompilationUnitTree`
in `src/main/java/com/google/testing/compile/MoreTrees.java`
#### Snippet
```java
  }

  /** Parses the source given into a {@link CompilationUnitTree}. */
  static CompilationUnitTree parseLinesToTree(Iterable<String> source) {
    Iterable<? extends CompilationUnitTree> parseResults =
```

### JavadocReference
Cannot resolve symbol `Tree`
in `src/main/java/com/google/testing/compile/TreeDiffer.java`
#### Snippet
```java

    /**
     * Pushes the {@code expected} and {@code actual} {@link Tree}s onto their respective {@link
     * TreePath}s and recurses with {@code expected.accept(this, actual)}, popping the stack when
     * the call completes.
```

### JavadocReference
Cannot resolve symbol `TreePath`
in `src/main/java/com/google/testing/compile/TreeDiffer.java`
#### Snippet
```java
    /**
     * Pushes the {@code expected} and {@code actual} {@link Tree}s onto their respective {@link
     * TreePath}s and recurses with {@code expected.accept(this, actual)}, popping the stack when
     * the call completes.
     *
```

### JavadocReference
Cannot resolve symbol `TreePath`
in `src/main/java/com/google/testing/compile/TreeDiffer.java`
#### Snippet
```java
     * the call completes.
     *
     * <p>This should be the ONLY place where either {@link TreePath} is mutated.
     */
    private @Nullable Void pushPathAndAccept(Tree expected, Tree actual) {
```

### JavadocReference
Cannot resolve symbol `SimpleTreeVisitor`
in `src/main/java/com/google/testing/compile/TreeDiffer.java`
#### Snippet
```java
     * compile on earlier versions.
     *
     * <p>Instead, we override {@link SimpleTreeVisitor#defaultAction} and inspect the visited tree
     * with reflection. We can use {@link Tree.Kind#getInterface()} to get the specific interface,
     * such as {@code YieldTree}, and within that interface we just look for {@code getFoo()}
```

### JavadocReference
Cannot resolve symbol `defaultAction`
in `src/main/java/com/google/testing/compile/TreeDiffer.java`
#### Snippet
```java
     * compile on earlier versions.
     *
     * <p>Instead, we override {@link SimpleTreeVisitor#defaultAction} and inspect the visited tree
     * with reflection. We can use {@link Tree.Kind#getInterface()} to get the specific interface,
     * such as {@code YieldTree}, and within that interface we just look for {@code getFoo()}
```

### JavadocReference
Cannot resolve symbol `Tree.Kind`
in `src/main/java/com/google/testing/compile/TreeDiffer.java`
#### Snippet
```java
     *
     * <p>Instead, we override {@link SimpleTreeVisitor#defaultAction} and inspect the visited tree
     * with reflection. We can use {@link Tree.Kind#getInterface()} to get the specific interface,
     * such as {@code YieldTree}, and within that interface we just look for {@code getFoo()}
     * methods. The {@code actual} tree must have the same {@link Tree.Kind} and then we can compare
```

### JavadocReference
Cannot resolve symbol `getInterface()`
in `src/main/java/com/google/testing/compile/TreeDiffer.java`
#### Snippet
```java
     *
     * <p>Instead, we override {@link SimpleTreeVisitor#defaultAction} and inspect the visited tree
     * with reflection. We can use {@link Tree.Kind#getInterface()} to get the specific interface,
     * such as {@code YieldTree}, and within that interface we just look for {@code getFoo()}
     * methods. The {@code actual} tree must have the same {@link Tree.Kind} and then we can compare
```

### JavadocReference
Cannot resolve symbol `Tree.Kind`
in `src/main/java/com/google/testing/compile/TreeDiffer.java`
#### Snippet
```java
     * with reflection. We can use {@link Tree.Kind#getInterface()} to get the specific interface,
     * such as {@code YieldTree}, and within that interface we just look for {@code getFoo()}
     * methods. The {@code actual} tree must have the same {@link Tree.Kind} and then we can compare
     * the results of calling the corresponding {@code getFoo()} methods on both trees. The
     * comparison depends on the return type of the method:
```

### JavadocReference
Cannot resolve symbol `Tree`
in `src/main/java/com/google/testing/compile/TreeDiffer.java`
#### Snippet
```java
     *
     * <ul>
     *   <li>For a method returning {@link Tree} or a subtype, we call {@link #scan(Tree, Tree)},
     *       which will visit the subtrees recursively.
     *   <li>For a method returning a type that is assignable to {@code Iterable<? extends Tree>},
```

### JavadocReference
Cannot resolve symbol `Tree`
in `src/main/java/com/google/testing/compile/TreeDiffer.java`
#### Snippet
```java
     *
     * <ul>
     *   <li>For a method returning {@link Tree} or a subtype, we call {@link #scan(Tree, Tree)},
     *       which will visit the subtrees recursively.
     *   <li>For a method returning a type that is assignable to {@code Iterable<? extends Tree>},
```

### JavadocReference
Cannot resolve symbol `Tree`
in `src/main/java/com/google/testing/compile/TreeDiffer.java`
#### Snippet
```java
     *
     * <ul>
     *   <li>For a method returning {@link Tree} or a subtype, we call {@link #scan(Tree, Tree)},
     *       which will visit the subtrees recursively.
     *   <li>For a method returning a type that is assignable to {@code Iterable<? extends Tree>},
```

### JavadocReference
Cannot resolve symbol `LineMap`
in `src/main/java/com/google/testing/compile/TreeDiffer.java`
#### Snippet
```java
     *   <li>For a method returning {@link Name}, we compare with {@link Name#contentEquals}.
     *   <li>Otherwise we just compare with {@link Objects#equals(Object, Object)}.
     *   <li>Methods returning certain types are ignored: {@link LineMap}, because we don't care if
     *       the line numbers don't match between the two trees; {@link JavaFileObject}, because the
     *       value for two distinct trees will never compare equal.
```

### JavadocReference
Cannot resolve symbol `Tree`
in `src/main/java/com/google/testing/compile/TreeDiffer.java`
#### Snippet
```java

  /**
   * A {@code SimpleTreeVisitor} that traverses a {@link Tree} and an argument {@link Tree},
   * verifying equality along the way. Appends each diff it finds to a {@link
   * TreeDifference.Builder}.
```

### JavadocReference
Cannot resolve symbol `Tree`
in `src/main/java/com/google/testing/compile/TreeDiffer.java`
#### Snippet
```java

  /**
   * A {@code SimpleTreeVisitor} that traverses a {@link Tree} and an argument {@link Tree},
   * verifying equality along the way. Appends each diff it finds to a {@link
   * TreeDifference.Builder}.
```

### JavadocReference
Cannot resolve symbol `Tree`
in `src/main/java/com/google/testing/compile/TreeDiffer.java`
#### Snippet
```java

  /**
   * A {@link TreeFilter} that ignores all {@link Tree}s that don't have a matching {@link Tree} in
   * a pattern. For more information on what trees are filtered, see {@link
   * JavaFileObjectSubject#containsElementsIn(JavaFileObject)}.
```

### JavadocReference
Cannot resolve symbol `Tree`
in `src/main/java/com/google/testing/compile/TreeDiffer.java`
#### Snippet
```java

  /**
   * A {@link TreeFilter} that ignores all {@link Tree}s that don't have a matching {@link Tree} in
   * a pattern. For more information on what trees are filtered, see {@link
   * JavaFileObjectSubject#containsElementsIn(JavaFileObject)}.
```

### JavadocReference
Cannot resolve symbol `TreePath`
in `src/main/java/com/google/testing/compile/TreeDiffer.java`
#### Snippet
```java
  /**
   * Returns a {@link TreeDifference} describing the difference between the two sub-{@code Tree}s.
   * The trees diffed are the leaves of the {@link TreePath}s provided.
   *
   * <p>Used for testing.
```

### JavadocReference
Cannot resolve symbol `Tree`
in `src/main/java/com/google/testing/compile/TreeDifference.java`
#### Snippet
```java

/**
 * A data structure describing the set of syntactic differences between two {@link Tree}s.
 *
 * @author Stephen Pratt
```

### JavadocReference
Cannot resolve symbol `ErroneousTree`
in `src/main/java/com/google/testing/compile/Parser.java`
#### Snippet
```java
   *
   * <p>Normally, the parser reports error diagnostics, but in some cases there are no diagnostics;
   * instead the parse tree contains {@linkplain ErroneousTree "erroneous"} nodes.
   */
  private static boolean foundParseErrors(
```

### JavadocReference
Cannot resolve symbol `ErroneousTree`
in `src/main/java/com/google/testing/compile/Parser.java`
#### Snippet
```java

  /**
   * Returns {@code true} if the tree contains at least one {@linkplain ErroneousTree "erroneous"}
   * node.
   */
```

### JavadocReference
Cannot resolve symbol `Trees`
in `src/main/java/com/google/testing/compile/Parser.java`
#### Snippet
```java

  /**
   * The diagnostic, parse trees, and {@link Trees} instance for a parse task.
   *
   * <p>Note: It is possible for the {@link Trees} instance contained within a {@code ParseResult}
```

### JavadocReference
Cannot resolve symbol `Trees`
in `src/main/java/com/google/testing/compile/Parser.java`
#### Snippet
```java
   * The diagnostic, parse trees, and {@link Trees} instance for a parse task.
   *
   * <p>Note: It is possible for the {@link Trees} instance contained within a {@code ParseResult}
   * to be invalidated by a call to {@link com.sun.tools.javac.api.JavacTaskImpl#cleanup()}. Though
   * we do not currently expose the {@link JavacTask} used to create a {@code ParseResult} to {@code
```

### JavadocReference
Cannot resolve symbol `com.sun.tools.javac.api.JavacTaskImpl`
in `src/main/java/com/google/testing/compile/Parser.java`
#### Snippet
```java
   *
   * <p>Note: It is possible for the {@link Trees} instance contained within a {@code ParseResult}
   * to be invalidated by a call to {@link com.sun.tools.javac.api.JavacTaskImpl#cleanup()}. Though
   * we do not currently expose the {@link JavacTask} used to create a {@code ParseResult} to {@code
   * cleanup()} calls on its underlying implementation, this should be acknowledged as an
```

### JavadocReference
Cannot resolve symbol `cleanup()`
in `src/main/java/com/google/testing/compile/Parser.java`
#### Snippet
```java
   *
   * <p>Note: It is possible for the {@link Trees} instance contained within a {@code ParseResult}
   * to be invalidated by a call to {@link com.sun.tools.javac.api.JavacTaskImpl#cleanup()}. Though
   * we do not currently expose the {@link JavacTask} used to create a {@code ParseResult} to {@code
   * cleanup()} calls on its underlying implementation, this should be acknowledged as an
```

### JavadocReference
Cannot resolve symbol `JavacTask`
in `src/main/java/com/google/testing/compile/Parser.java`
#### Snippet
```java
   * <p>Note: It is possible for the {@link Trees} instance contained within a {@code ParseResult}
   * to be invalidated by a call to {@link com.sun.tools.javac.api.JavacTaskImpl#cleanup()}. Though
   * we do not currently expose the {@link JavacTask} used to create a {@code ParseResult} to {@code
   * cleanup()} calls on its underlying implementation, this should be acknowledged as an
   * implementation detail that could cause unexpected behavior when making calls to methods in
```

### JavadocReference
Cannot resolve symbol `Trees`
in `src/main/java/com/google/testing/compile/Parser.java`
#### Snippet
```java
   * cleanup()} calls on its underlying implementation, this should be acknowledged as an
   * implementation detail that could cause unexpected behavior when making calls to methods in
   * {@link Trees}.
   */
  static final class ParseResult {
```

### JavadocReference
Cannot resolve symbol `CompilationUnitTree`
in `src/main/java/com/google/testing/compile/Parser.java`
#### Snippet
```java

  /**
   * Parses {@code sources} into {@linkplain CompilationUnitTree compilation units}. This method
   * <b>does not</b> compile the sources.
   *
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

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `details` may be 'final'
in `src/main/java/com/google/testing/compile/TreeDifference.java`
#### Snippet
```java
  static final class OneWayDiff {
    private final TreePath nodePath;
    private String details;

    OneWayDiff(TreePath nodePath, String details) {
```

### FieldMayBeFinal
Field `details` may be 'final'
in `src/main/java/com/google/testing/compile/TreeDifference.java`
#### Snippet
```java
    private final TreePath expectedNodePath;
    private final TreePath actualNodePath;
    private String details;

    TwoWayDiff(TreePath expectedNodePath, TreePath actualNodePath, String details) {
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

## RuleId[id=FinalMethodInFinalClass]
### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/google/testing/compile/JavaFileObjects.java`
#### Snippet
```java
    static final Splitter JAR_URL_SPLITTER = Splitter.on('!');

    static final URI getPathUri(URL jarUrl) {
      ImmutableList<String> parts = ImmutableList.copyOf(JAR_URL_SPLITTER.split(jarUrl.getPath()));
      checkArgument(parts.size() == 2,
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

## RuleId[id=Deprecation]
### Deprecation
'withClasspathFrom(java.lang.ClassLoader)' is deprecated
in `src/main/java/com/google/testing/compile/JavaSourcesSubject.java`
#### Snippet
```java
      Compiler compiler = javac().withProcessors(processors).withOptions(options);
      if (classLoader != null) {
        compiler = compiler.withClasspathFrom(classLoader);
      }
      if (classPath != null) {
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

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/main/java/com/google/testing/compile/JavaSourcesSubject.java`
#### Snippet
```java
    implements CompileTester, ProcessedCompileTesterFactory {
  private final @Nullable Iterable<? extends JavaFileObject> actual;
  private final List<String> options = new ArrayList<>(Arrays.asList("-Xlint"));
  @Nullable private ClassLoader classLoader;
  @Nullable private ImmutableList<File> classPath;
```

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Explicit type arguments can be inferred
in `src/main/java/com/google/testing/compile/Compiler.java`
#### Snippet
```java
                diagnosticCollector,
                options(),
                ImmutableSet.<String>of(),
                files);
    task.setProcessors(processors());
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `src/main/java/com/google/testing/compile/TreeDifference.java`
#### Snippet
```java
  /** Constructs an empty {@code TreeDifference}. */
  TreeDifference() {
    this.extraExpectedNodes = ImmutableList.<OneWayDiff>of();
    this.extraActualNodes = ImmutableList.<OneWayDiff>of();
    this.differingNodes = ImmutableList.<TwoWayDiff>of();
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `src/main/java/com/google/testing/compile/TreeDifference.java`
#### Snippet
```java
  TreeDifference() {
    this.extraExpectedNodes = ImmutableList.<OneWayDiff>of();
    this.extraActualNodes = ImmutableList.<OneWayDiff>of();
    this.differingNodes = ImmutableList.<TwoWayDiff>of();
  }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `src/main/java/com/google/testing/compile/TreeDifference.java`
#### Snippet
```java
    this.extraExpectedNodes = ImmutableList.<OneWayDiff>of();
    this.extraActualNodes = ImmutableList.<OneWayDiff>of();
    this.differingNodes = ImmutableList.<TwoWayDiff>of();
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

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `src/main/java/com/google/testing/compile/JavaFileObjects.java`
#### Snippet
```java
  static ByteSource asByteSource(final JavaFileObject javaFileObject) {
    return new ByteSource() {
      @Override public InputStream openStream() throws IOException {
        return javaFileObject.openInputStream();
      }
```

### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `src/main/java/com/google/testing/compile/InMemoryJavaFileManager.java`
#### Snippet
```java
              new CacheLoader<URI, JavaFileObject>() {
                @Override
                public JavaFileObject load(URI key) {
                  return new InMemoryJavaFileObject(key);
                }
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `src/main/java/com/google/testing/compile/InMemoryJavaFileManager.java`
#### Snippet
```java
              new CacheLoader<URI, JavaFileObject>() {
                @Override
                public JavaFileObject load(URI key) {
                  return new InMemoryJavaFileObject(key);
                }
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

