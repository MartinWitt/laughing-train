# Arend 
 
# Bad smells
I found 127 bad smells with 5 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UNUSED_IMPORT | 27 | false |
| BlockingMethodInNonBlockingContext | 24 | false |
| DuplicatedCode | 18 | false |
| RedundantMethodOverride | 10 | false |
| UNCHECKED_WARNING | 8 | false |
| CommentedOutCode | 7 | false |
| ConstantValue | 7 | false |
| SimplifyStreamApiCallChains | 5 | false |
| UnnecessaryUnicodeEscape | 4 | false |
| NonStrictComparisonCanBeEquality | 3 | true |
| DataFlowIssue | 3 | false |
| UnnecessaryToStringCall | 2 | true |
| NullableProblems | 2 | false |
| JavadocLinkAsPlainText | 2 | false |
| EmptyStatementBody | 1 | false |
| FinalMethodInFinalClass | 1 | false |
| MismatchedJavadocCode | 1 | false |
| SuspiciousListRemoveInLoop | 1 | false |
| TrivialIf | 1 | false |
## RuleId[id=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `base/src/main/java/org/arend/typechecking/order/Ordering.java`
#### Snippet
```java
      }
      if (definition instanceof Concrete.UseDefinition && ((Concrete.UseDefinition) definition).getKind() != FunctionKind.FUNC_COCLAUSE) {
        if (myStage.ordinal() >= Stage.WITHOUT_USE.ordinal()) {
          myOrderingListener.cycleFound(scc);
          return;
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `base/src/main/java/org/arend/typechecking/implicitargs/equations/TwoStageEquations.java`
#### Snippet
```java

    // _ <= max(-c, -d), _ <= max(l - c, -d) // 6
    if (!(var2 instanceof InferenceLevelVariable) && maxConstant < 0 && (constant < 0 || constant == 0 && var2 != null && var2.getType() == LevelVariable.LvlType.HLVL && var1 == null) && !(var2 == null && var1 instanceof InferenceLevelVariable && var1.getType() == LevelVariable.LvlType.HLVL && constant >= -1 && maxConstant >= -1)) {
      myVisitor.getErrorReporter().report(new SolveLevelEquationsError(Collections.singletonList(new LevelEquation<>(var1, var2, constant)), sourceNode));
      return;
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `base/src/main/java/org/arend/typechecking/implicitargs/equations/TwoStageEquations.java`
#### Snippet
```java

    // _ <= max(-c, -d), _ <= max(l - c, -d) // 6
    if (!(var2 instanceof InferenceLevelVariable) && maxConstant < 0 && (constant < 0 || constant == 0 && var2 != null && var2.getType() == LevelVariable.LvlType.HLVL && var1 == null) && !(var2 == null && var1 instanceof InferenceLevelVariable && var1.getType() == LevelVariable.LvlType.HLVL && constant >= -1 && maxConstant >= -1)) {
      myVisitor.getErrorReporter().report(new SolveLevelEquationsError(Collections.singletonList(new LevelEquation<>(var1, var2, constant)), sourceNode));
      return;
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `visitError()` is identical to its super method
in `base/src/main/java/org/arend/core/expr/visitor/NormalizingFindBindingVisitor.java`
#### Snippet
```java

  @Override
  public Boolean visitError(ErrorExpression expr, Void params) {
    return false;
  }
```

### RedundantMethodOverride
Method `visitUniverse()` is identical to its super method
in `base/src/main/java/org/arend/core/expr/visitor/NormalizingFindBindingVisitor.java`
#### Snippet
```java

  @Override
  public Boolean visitUniverse(UniverseExpression expr, Void params) {
    return false;
  }
```

### RedundantMethodOverride
Method `prettyPrint()` is identical to its super method
in `base/src/main/java/org/arend/core/pattern/ExpressionPattern.java`
#### Snippet
```java

  @Override
  default LineDoc prettyPrint(PrettyPrinterConfig ppConfig) {
    return DocFactory.pattern(this, ppConfig);
  }
```

### RedundantMethodOverride
Method `getPLevelParameters()` is identical to its super method
in `base/src/main/java/org/arend/term/concrete/DefinableMetaDefinition.java`
#### Snippet
```java
  }

  public Concrete.LevelParameters getPLevelParameters() {
    return pLevelParameters;
  }
```

### RedundantMethodOverride
Method `getHLevelParameters()` is identical to its super method
in `base/src/main/java/org/arend/term/concrete/DefinableMetaDefinition.java`
#### Snippet
```java
  }

  public Concrete.LevelParameters getHLevelParameters() {
    return hLevelParameters;
  }
```

### RedundantMethodOverride
Method `visitThis()` is identical to its super method
in `base/src/main/java/org/arend/term/concrete/SubstConcreteVisitor.java`
#### Snippet
```java

  @Override
  public Concrete.Expression visitThis(Concrete.ThisExpression expr, Void ignored) {
    return expr;
  }
```

### RedundantMethodOverride
Method `printSpaceBefore()` is identical to its super method
in `base/src/main/java/org/arend/term/prettyprint/PrettyPrintVisitor.java`
#### Snippet
```java

      @Override
      boolean printSpaceBefore() { return true; }

      @Override
```

### RedundantMethodOverride
Method `printSpaceBefore()` is identical to its super method
in `base/src/main/java/org/arend/term/prettyprint/PrettyPrintVisitor.java`
#### Snippet
```java

      @Override
      boolean printSpaceBefore() { return true;}

      @Override
```

### RedundantMethodOverride
Method `getTypecheckable()` is identical to its super method
in `base/src/main/java/org/arend/naming/reference/TCLevelReferable.java`
#### Snippet
```java

  @Override
  public @NotNull TCReferable getTypecheckable() {
    return this;
  }
```

### RedundantMethodOverride
Method `visitApplyHole()` is identical to its super method
in `base/src/main/java/org/arend/typechecking/visitor/SyntacticDesugarVisitor.java`
#### Snippet
```java

  @Override
  public Concrete.Expression visitApplyHole(Concrete.ApplyHoleExpression expr, Void params) {
    return expr;
  }
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `base/src/main/java/org/arend/module/serialization/ModuleDeserialization.java`
#### Snippet
```java
    }

    List<Statement> statements = new ArrayList<>(groupProto.getSubgroupCount());

    StaticGroup group;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `base/src/main/java/org/arend/module/serialization/ModuleDeserialization.java`
#### Snippet
```java
      }

      List<Group> dynamicGroups = new ArrayList<>(groupProto.getDynamicSubgroupCount());
      group = new ClassGroup((ClassReferable) referable, internalReferables, dynamicGroups, statements, Collections.emptyList(), parent);
      for (ModuleProtos.Group subgroupProto : groupProto.getDynamicSubgroupList()) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `base/src/main/java/org/arend/module/serialization/DefinitionDeserialization.java`
#### Snippet
```java
      }
      case INTERVAL_ELIM -> {
        List<IntervalElim.CasePair> cases = new ArrayList<>(proto.getIntervalElim().getCaseCount());
        for (DefinitionProtos.Body.ExpressionPair pairProto : proto.getIntervalElim().getCaseList()) {
          cases.add(new IntervalElim.CasePair(pairProto.hasLeft() ? defDeserializer.readExpr(pairProto.getLeft()) : null, pairProto.hasRight() ? defDeserializer.readExpr(pairProto.getRight()) : null));
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `base/src/main/java/org/arend/module/serialization/DefinitionDeserialization.java`
#### Snippet
```java

  private void fillInMetaDefinition(ExpressionDeserialization defDeserializer, DefinitionProtos.Definition.MetaData metaProto, MetaTopDefinition metaDef) throws DeserializationException {
    metaDef.setParameters(defDeserializer.readParameters(metaProto.getParamList()), new ArrayList<>(metaProto.getTypedParamList()));
  }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `base/src/main/java/org/arend/module/serialization/ExpressionDeserialization.java`
#### Snippet
```java

  private SingleDependentLink readSingleParameter(ExpressionProtos.Telescope proto) throws DeserializationException {
    List<String> unfixedNames = new ArrayList<>(proto.getNameList().size());
    for (String name : proto.getNameList()) {
      unfixedNames.add(name.isEmpty() ? null : name);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashSet' to 'java.util.Set'
in `base/src/main/java/org/arend/module/serialization/ExpressionDeserialization.java`
#### Snippet
```java
          if (singleClause.hasTuple()) {
            ExpressionProtos.ElimTree.Branch.SingleConstructorClause.Tuple tupleProto = singleClause.getTuple();
            result.addChild(new TupleConstructor(tupleProto.getLength(), new HashSet<>(tupleProto.getPropertyIndexList())), elimTree);
          }
          if (singleClause.hasIdp()) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `base/src/main/java/org/arend/module/serialization/ExpressionDeserialization.java`
#### Snippet
```java
    LinkList list = new LinkList();
    for (ExpressionProtos.Telescope proto : protos) {
      List<String> unfixedNames = new ArrayList<>(proto.getNameList().size());
      for (String name : proto.getNameList()) {
        unfixedNames.add(name.isEmpty() ? null : name);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `base/src/main/java/org/arend/module/serialization/ExpressionDeserialization.java`
#### Snippet
```java

  private CaseExpression readCase(ExpressionProtos.Expression.Case proto) throws DeserializationException {
    List<Expression> arguments = new ArrayList<>(proto.getArgumentCount());
    ElimBody elimBody = readElimBody(proto.getElimBody());
    DependentLink parameters = readParameters(proto.getParamList());
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method `doTypechecking` is too complex to analyze by data flow algorithm
in `base/src/main/java/org/arend/typechecking/patternmatching/PatternTypechecking.java`
#### Snippet
```java
  }

  private Result doTypechecking(List<Concrete.Pattern> patterns, DependentLink parameters, ExprSubstitution paramsSubst, ExprSubstitution totalSubst, ConcreteSourceNode sourceNode, boolean withElim, int addIntervalVars) {
    List<ExpressionPattern> result = new ArrayList<>();
    List<Expression> exprs = new ArrayList<>();
```

### DataFlowIssue
Method `clausesToElimTree` is too complex to analyze by data flow algorithm
in `base/src/main/java/org/arend/typechecking/patternmatching/ElimTypechecking.java`
#### Snippet
```java
  }

  private ElimTree clausesToElimTree(List<ExtElimClause> clauses, int argsStackSize, int numberOfIntervals) {
    try (Utils.ContextSaver ignored = new Utils.ContextSaver(myContext)) {
      int index = 0;
```

### DataFlowIssue
Method `typecheckFunctionBody` is too complex to analyze by data flow algorithm
in `base/src/main/java/org/arend/typechecking/visitor/DefinitionTypechecker.java`
#### Snippet
```java
  }

  private List<ExtElimClause> typecheckFunctionBody(FunctionDefinition typedDef, Concrete.BaseFunctionDefinition def) {
    UniverseKind universeKind = typedDef.getUniverseKind();
    if (myNewDef) {
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import org.arend.ext.core.level.CoreSort;`
in `api/src/main/java/org/arend/ext/core/expr/CoreArrayExpression.java`
#### Snippet
```java

import org.arend.ext.core.level.CoreLevel;
import org.arend.ext.core.level.CoreSort;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
```

### UNUSED_IMPORT
Unused import `import org.arend.ext.core.level.CoreLevel;`
in `api/src/main/java/org/arend/ext/core/expr/CoreDefCallExpression.java`
#### Snippet
```java

import org.arend.ext.core.definition.CoreDefinition;
import org.arend.ext.core.level.CoreLevel;
import org.arend.ext.core.level.CoreLevels;
import org.arend.ext.core.level.CoreSort;
```

### UNUSED_IMPORT
Unused import `import org.arend.ext.core.level.CoreLevels;`
in `api/src/main/java/org/arend/ext/core/expr/CoreDefCallExpression.java`
#### Snippet
```java
import org.arend.ext.core.definition.CoreDefinition;
import org.arend.ext.core.level.CoreLevel;
import org.arend.ext.core.level.CoreLevels;
import org.arend.ext.core.level.CoreSort;
import org.jetbrains.annotations.NotNull;
```

### UNUSED_IMPORT
Unused import `import org.arend.ext.core.level.CoreSort;`
in `api/src/main/java/org/arend/ext/core/expr/CoreDefCallExpression.java`
#### Snippet
```java
import org.arend.ext.core.level.CoreLevel;
import org.arend.ext.core.level.CoreLevels;
import org.arend.ext.core.level.CoreSort;
import org.jetbrains.annotations.NotNull;

```

### UNUSED_IMPORT
Unused import `import java.util.Iterator;`
in `api/src/main/java/org/arend/ext/error/GeneralError.java`
#### Snippet
```java

import java.util.Collection;
import java.util.Iterator;
import java.util.function.BiConsumer;

```

### UNUSED_IMPORT
Unused import `import org.arend.ext.typechecking.TypedExpression;`
in `api/src/main/java/org/arend/ext/instance/InstanceSearchParameters.java`
#### Snippet
```java
import org.arend.ext.core.definition.CoreFunctionDefinition;
import org.arend.ext.core.expr.CoreExpression;
import org.arend.ext.typechecking.TypedExpression;
import org.jetbrains.annotations.NotNull;

```

### UNUSED_IMPORT
Unused import `import org.arend.ext.concrete.ConcreteClause;`
in `api/src/main/java/org/arend/ext/typechecking/ContextData.java`
#### Snippet
```java
package org.arend.ext.typechecking;

import org.arend.ext.concrete.ConcreteClause;
import org.arend.ext.concrete.expr.*;
import org.arend.ext.core.expr.CoreExpression;
```

### UNUSED_IMPORT
Unused import `import org.arend.ext.core.expr.CoreExpression;`
in `api/src/main/java/org/arend/ext/typechecking/ContextData.java`
#### Snippet
```java
import org.arend.ext.concrete.ConcreteClause;
import org.arend.ext.concrete.expr.*;
import org.arend.ext.core.expr.CoreExpression;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
```

### UNUSED_IMPORT
Unused import `import org.jetbrains.annotations.Nullable;`
in `api/src/main/java/org/arend/ext/variable/Variable.java`
#### Snippet
```java
package org.arend.ext.variable;

import org.jetbrains.annotations.Nullable;

public interface Variable {
```

### UNUSED_IMPORT
Unused import `import org.arend.ext.typechecking.MetaDefinition;`
in `base/src/main/java/org/arend/core/context/binding/inference/MetaInferenceVariable.java`
#### Snippet
```java
import org.arend.ext.error.TypeMismatchError;
import org.arend.ext.error.TypecheckingError;
import org.arend.ext.typechecking.MetaDefinition;
import org.arend.term.concrete.Concrete;

```

### UNUSED_IMPORT
Unused import `import org.arend.core.subst.LevelPair;`
in `base/src/main/java/org/arend/core/expr/AbsExpression.java`
#### Snippet
```java
import org.arend.core.context.binding.Binding;
import org.arend.core.subst.ExprSubstitution;
import org.arend.core.subst.LevelPair;
import org.arend.ext.core.expr.CoreAbsExpression;
import org.arend.ext.core.level.LevelSubstitution;
```

### UNUSED_IMPORT
Unused import `import org.jetbrains.annotations.Nullable;`
in `base/src/main/java/org/arend/core/expr/PathExpression.java`
#### Snippet
```java
import org.arend.util.Decision;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PathExpression extends Expression implements CorePathExpression {
```

### UNUSED_IMPORT
Unused import `import org.arend.ext.concrete.ConcreteClause;`
in `base/src/main/java/org/arend/extImpl/ContextDataImpl.java`
#### Snippet
```java

import org.arend.core.expr.Expression;
import org.arend.ext.concrete.ConcreteClause;
import org.arend.ext.concrete.expr.ConcreteArgument;
import org.arend.ext.concrete.expr.ConcreteClauses;
```

### UNUSED_IMPORT
Unused import `import org.arend.ext.core.expr.CoreExpression;`
in `base/src/main/java/org/arend/extImpl/ContextDataImpl.java`
#### Snippet
```java
import org.arend.ext.concrete.expr.ConcreteCoclauses;
import org.arend.ext.concrete.expr.ConcreteExpression;
import org.arend.ext.core.expr.CoreExpression;
import org.arend.ext.typechecking.ContextData;
import org.arend.term.concrete.Concrete;
```

### UNUSED_IMPORT
Unused import `import org.arend.naming.reference.converter.IdReferableConverter;`
in `base/src/main/java/org/arend/library/PersistableSourceLibrary.java`
#### Snippet
```java
import org.arend.ext.error.ErrorReporter;
import org.arend.ext.module.ModulePath;
import org.arend.naming.reference.converter.IdReferableConverter;
import org.arend.term.group.ChildGroup;
import org.jetbrains.annotations.Nullable;
```

### UNUSED_IMPORT
Unused import `import org.arend.naming.scope.local.LocalListScope;`
in `base/src/main/java/org/arend/naming/scope/ScopeFactory.java`
#### Snippet
```java
import org.arend.naming.reference.*;
import org.arend.naming.resolving.visitor.ExpressionResolveNameVisitor;
import org.arend.naming.scope.local.LocalListScope;
import org.arend.naming.scope.local.*;
import org.arend.prelude.Prelude;
```

### UNUSED_IMPORT
Unused import `import org.arend.ext.concrete.definition.ClassFieldKind;`
in `base/src/main/java/org/arend/term/concrete/Concrete.java`
#### Snippet
```java
import org.arend.ext.util.Pair;
import org.arend.naming.reference.*;
import org.arend.ext.concrete.definition.ClassFieldKind;
import org.arend.term.Fixity;
import org.arend.term.abs.Abstract;
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `base/src/main/java/org/arend/term/concrete/FreeReferablesVisitor.java`
#### Snippet
```java
import org.arend.naming.reference.TCReferable;

import java.util.List;
import java.util.Set;

```

### UNUSED_IMPORT
Unused import `import static org.arend.ext.prettyprinting.doc.DocFactory.text;`
in `base/src/main/java/org/arend/typechecking/error/local/HigherConstructorMatchingError.java`
#### Snippet
```java

import static org.arend.ext.prettyprinting.doc.DocFactory.*;
import static org.arend.ext.prettyprinting.doc.DocFactory.text;

public class HigherConstructorMatchingError extends TypecheckingError {
```

### UNUSED_IMPORT
Unused import `import static org.arend.ext.prettyprinting.doc.DocFactory.text;`
in `base/src/main/java/org/arend/typechecking/error/local/SuperLevelsMismatchError.java`
#### Snippet
```java

import static org.arend.ext.prettyprinting.doc.DocFactory.*;
import static org.arend.ext.prettyprinting.doc.DocFactory.text;

public class SuperLevelsMismatchError extends TypecheckingError {
```

### UNUSED_IMPORT
Unused import `import org.arend.ext.error.ArgInferenceError;`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
import org.arend.typechecking.error.ErrorReporterCounter;
import org.arend.typechecking.error.local.*;
import org.arend.ext.error.ArgInferenceError;
import org.arend.typechecking.error.local.inference.RecursiveInstanceInferenceError;
import org.arend.typechecking.implicitargs.ImplicitArgsInference;
```

### UNUSED_IMPORT
Unused import `import java.nio.file.FileSystems;`
in `cli/src/main/java/org/arend/frontend/BaseCliFrontend.java`
#### Snippet
```java

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
```

### UNUSED_IMPORT
Unused import `import org.arend.term.abs.Abstract;`
in `cli/src/main/java/org/arend/frontend/group/SimpleNamespaceCommand.java`
#### Snippet
```java
import org.arend.term.NameRenaming;
import org.arend.term.NamespaceCommand;
import org.arend.term.abs.Abstract;
import org.arend.term.group.ChildGroup;
import org.arend.term.group.Group;
```

### UNUSED_IMPORT
Unused import `import org.arend.term.group.Group;`
in `cli/src/main/java/org/arend/frontend/group/SimpleNamespaceCommand.java`
#### Snippet
```java
import org.arend.term.abs.Abstract;
import org.arend.term.group.ChildGroup;
import org.arend.term.group.Group;
import org.arend.term.group.Statement;
import org.jetbrains.annotations.NotNull;
```

### UNUSED_IMPORT
Unused import `import org.arend.naming.reference.InternalConcreteLocatedReferable;`
in `cli/src/main/java/org/arend/frontend/parser/BuildVisitor.java`
#### Snippet
```java
import org.arend.frontend.reference.*;
import org.arend.module.ModuleLocation;
import org.arend.naming.reference.InternalConcreteLocatedReferable;
import org.arend.naming.reference.*;
import org.arend.naming.resolving.visitor.TypeClassReferenceExtractVisitor;
```

### UNUSED_IMPORT
Unused import `import org.arend.util.FileUtils;`
in `cli/src/main/java/org/arend/frontend/repl/action/LoadLibraryCommand.java`
#### Snippet
```java
import org.arend.library.Library;
import org.arend.repl.action.DirectoryArgumentCommand;
import org.arend.util.FileUtils;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;
```

### UNUSED_IMPORT
Unused import `import org.jline.reader.impl.DefaultParser;`
in `cli/src/main/java/org/arend/frontend/repl/jline/JLineCliRepl.java`
#### Snippet
```java
import org.jline.reader.LineReaderBuilder;
import org.jline.reader.UserInterruptException;
import org.jline.reader.impl.DefaultParser;
import org.jline.reader.impl.completer.AggregateCompleter;
import org.jline.reader.impl.completer.StringsCompleter;
```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`if` statement has empty body
in `base/src/main/java/org/arend/util/Range.java`
#### Snippet
```java
      int stop = i;

      if (Character.isWhitespace(text.charAt(i))) {
        // Do nothing
      } else if (text.charAt(i) == ',') {
```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `cli/src/main/java/org/arend/frontend/repl/jline/ImportCompleter.java`
#### Snippet
```java
    if (!Objects.equals("\\import", line.words().get(0))) return;
    if (line.wordIndex() == 1)
      candidates.addAll(moduleSupplier.get().map(Candidate::new).collect(Collectors.toList()));
  }
}
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `cli/src/main/java/org/arend/frontend/repl/jline/ArendReplParser.java`
#### Snippet
```java
      .limit(tokensRaw.size() - 1)
      .filter(token -> token.getChannel() != Token.HIDDEN_CHANNEL)
      .collect(Collectors.toList());
    var wordOpt = tokens.stream().filter(token ->
      token.getStartIndex() <= cursor && token.getStopIndex() + 1 >= cursor
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `base/src/main/java/org/arend/repl/CommandHandler.java`
#### Snippet
```java
    if (replCommand != null) replCommand.invoke(command.proj2, api, lineSupplier);
    else {
      var suitableCommands = determineEntries(command.proj1).collect(Collectors.toList());
      if (suitableCommands.isEmpty())
        api.eprintln("[ERROR] Unrecognized command: " + command.proj1 + ".");
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `base/src/main/java/org/arend/term/prettyprint/FreeVariableCollectorConcrete.java`
#### Snippet
```java

  private void removeParameters(List<? extends Concrete.Parameter> parameters) {
    parameters.stream().flatMap(a -> a.getRefList().stream()).collect(Collectors.toList()).forEach(myReferables::remove);
  }

```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `base/src/main/java/org/arend/term/prettyprint/MinimizedRepresentation.java`
#### Snippet
```java
    @Override
    public Concrete.Expression visitReference(Concrete.ReferenceExpression expr, Concrete.SourceNode params) {
        var errorList = myErrors.stream().filter(err -> err.getCauseSourceNode() == expr).collect(Collectors.toList());
        if (!errorList.isEmpty()) {
            var verboseExpr = (Concrete.Expression) params;
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (4 lines)
in `cli/src/main/java/org/arend/frontend/repl/action/LoadLibraryCommand.java`
#### Snippet
```java
  @Override
  public final void invoke(@NotNull String line, @NotNull CommonCliRepl api, @NotNull Supplier<@NotNull String> scanner) {
/*
    if (!FileUtils.isLibraryName(line)) {
      api.eprintln("[ERROR] `" + line + "` is not a valid library name.");
```

### CommentedOutCode
Commented out code (2 lines)
in `cli/src/main/java/org/arend/frontend/repl/CommonCliRepl.java`
#### Snippet
```java
    parser.removeErrorListeners();
    parser.addErrorListener(errorListener);
    // parser.addErrorListener(new DiagnosticErrorListener());
    // parser.getInterpreter().setPredictionMode(PredictionMode.LL_EXACT_AMBIG_DETECTION);
    return parser;
```

### CommentedOutCode
Commented out code (11 lines)
in `base/src/main/java/org/arend/core/expr/visitor/ElimBindingVisitor.java`
#### Snippet
```java
  public LetExpression visitLet(LetExpression letExpression, Void params) {
    throw new IllegalStateException();
    /*
    List<LetClause> newClauses = new ArrayList<>(letExpression.getClauses().size());
    for (LetClause clause : letExpression.getClauses()) {
```

### CommentedOutCode
Commented out code (104 lines)
in `base/src/main/java/org/arend/term/prettyprint/PrettyPrintVisitor.java`
#### Snippet
```java
  }

  /*
  private void visitWhere(Collection<? extends LegacyAbstract.Statement> statements) {
    myBuilder.append(" \\where {\n");
```

### CommentedOutCode
Commented out code (19 lines)
in `base/src/main/java/org/arend/core/expr/visitor/CompareVisitor.java`
#### Snippet
```java
  }

  /*
  private boolean compareIsoArgs(List<? extends Expression> list1, List<? extends Expression> list2, ExprSubstitution substitution) {
    DependentLink link = Prelude.ISO.getParameters();
```

### CommentedOutCode
Commented out code (74 lines)
in `base/src/main/java/org/arend/typechecking/visitor/FindLevelParameters.java`
#### Snippet
```java
  }

  /*
  @Override
  public Boolean visitLam(LamExpression expression, Void param) {
```

### CommentedOutCode
Commented out code (6 lines)
in `base/src/main/java/org/arend/typechecking/visitor/SyntacticDesugarVisitor.java`
#### Snippet
```java
    else if (expression instanceof Concrete.NewExpression)
      convertNewAppHoles((Concrete.NewExpression) expression, parameters);
/*
    else if (expression instanceof Concrete.CaseExpression)
      convertCaseAppHoles((Concrete.CaseExpression) expression, parameters);
```

## RuleId[id=FinalMethodInFinalClass]
### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `cli/src/main/java/org/arend/frontend/repl/action/LoadLibraryCommand.java`
#### Snippet
```java

  @Override
  public final void invoke(@NotNull String line, @NotNull CommonCliRepl api, @NotNull Supplier<@NotNull String> scanner) {
/*
    if (!FileUtils.isLibraryName(line)) {
```

## RuleId[id=UnnecessaryUnicodeEscape]
### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03bb` can be replaced with 'λ'
in `cli/src/main/java/org/arend/frontend/repl/PlainCliRepl.java`
#### Snippet
```java
  public PlainCliRepl() {
    super();
    prompt = "\u03bb ";
  }

```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u25ef` can be replaced with '◯'
in `cli/src/main/java/org/arend/frontend/BaseCliFrontend.java`
#### Snippet
```java
    switch (result) {
      case GOAL:
        return '\u25ef';
      case ERROR:
        return '\u2717';
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2717` can be replaced with '✗'
in `cli/src/main/java/org/arend/frontend/BaseCliFrontend.java`
#### Snippet
```java
        return '\u25ef';
      case ERROR:
        return '\u2717';
      default:
        return '\u00b7';
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00b7` can be replaced with '·'
in `cli/src/main/java/org/arend/frontend/BaseCliFrontend.java`
#### Snippet
```java
        return '\u2717';
      default:
        return '\u00b7';
    }
  }
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `base/src/main/java/org/arend/core/elimtree/IntervalElim.java`
#### Snippet
```java
    if (stuck != null && stuck.isInstance(ErrorExpression.class)) {
      return stuck;
    }

    InferenceReferenceExpression refStuck = stuck != null ? stuck.cast(InferenceReferenceExpression.class) : null;
    while (refStuck != null && refStuck.getSubstExpression() != null) {
      refStuck = refStuck.getSubstExpression().cast(InferenceReferenceExpression.class);
    }
```

### DuplicatedCode
Duplicated code
in `base/src/main/java/org/arend/core/elimtree/IntervalElim.java`
#### Snippet
```java
      if (stuck != null) {
        if (stuck.isInstance(ErrorExpression.class)) {
          return stuck;
        }
        if (refStuck == null) {
          refStuck = stuck.cast(InferenceReferenceExpression.class);
          while (refStuck != null && refStuck.getSubstExpression() != null) {
            refStuck = refStuck.getSubstExpression().cast(InferenceReferenceExpression.class);
          }
        }
      }
```

### DuplicatedCode
Duplicated code
in `base/src/main/java/org/arend/core/expr/visitor/CompareVisitor.java`
#### Snippet
```java
        Expression type1 = expr1.getType();
        if (type1 != null && type1.getStuckInferenceVariable() != null) {
          type1 = null;
        }
        if (type1 != null) {
          type1 = myNormalize ? type1.normalize(NormalizationMode.WHNF) : type1;
          if (allowProp) {
            Sort sort1 = type1.getSortOfType();
            if (sort1 != null && sort1.isProp() && !type1.isInstance(ClassCallExpression.class)) {
              myOnlySolveVars = true;
            }
          }
        }
```

### DuplicatedCode
Duplicated code
in `base/src/main/java/org/arend/core/pattern/ExpressionPattern.java`
#### Snippet
```java
    if (patterns1.size() != patterns2.size()) return false;
    for (int i = 0; i < patterns1.size(); i++) {
      if (!compare(patterns1.get(i), patterns2.get(i))) {
        return false;
      }
    }
    return true;
```

### DuplicatedCode
Duplicated code
in `base/src/main/java/org/arend/extImpl/ConcreteFactoryImpl.java`
#### Snippet
```java
    for (ConcreteClassElement element : elements) {
      if (!(element instanceof Concrete.ClassElement)) {
        throw new IllegalArgumentException();
      }
      if (!(element instanceof Concrete.ClassFieldImpl)) {
        throw new IllegalArgumentException("Expected a field implementation");
      }
      result.add((Concrete.ClassFieldImpl) element);
    }
    return result;
```

### DuplicatedCode
Duplicated code
in `base/src/main/java/org/arend/extImpl/ConcreteFactoryImpl.java`
#### Snippet
```java
    if (!(function instanceof Concrete.Expression fun)) {
      throw new IllegalArgumentException();
    }
    if (arguments.isEmpty()) {
      return fun;
    }
    List<Concrete.Argument> args = fun instanceof Concrete.AppExpression ? new ArrayList<>(((Concrete.AppExpression) fun).getArguments()) : new ArrayList<>(arguments.size());
```

### DuplicatedCode
Duplicated code
in `base/src/main/java/org/arend/module/serialization/DefinitionDeserialization.java`
#### Snippet
```java
    dataDef.setParameters(defDeserializer.readParameters(dataProto.getParamList()));
    List<Integer> parametersTypecheckingOrder = dataProto.getParametersTypecheckingOrderList();
    if (!parametersTypecheckingOrder.isEmpty()) {
      dataDef.setParametersTypecheckingOrder(parametersTypecheckingOrder);
    }
    List<Boolean> goodThisParameters = dataProto.getGoodThisParametersList();
    if (!goodThisParameters.isEmpty()) {
      dataDef.setGoodThisParameters(goodThisParameters);
    }
    dataDef.setTypeClassParameters(readTypeClassParametersKind(dataProto.getTypeClassParametersList()));
    for (DefinitionProtos.Definition.ParametersLevel levelParametersProto : dataProto.getParametersLevelsList()) {
      dataDef.addParametersLevel(readParametersLevel(defDeserializer, levelParametersProto));
    }
    List<Integer> recursiveDefIndices = dataProto.getRecursiveDefinitionList();
    if (!recursiveDefIndices.isEmpty()) {
      Set<TopLevelDefinition> recursiveDefs = new HashSet<>();
      for (Integer index : recursiveDefIndices) {
        recursiveDefs.add(myCallTargetProvider.getCallTarget(index, TopLevelDefinition.class));
      }
      dataDef.setRecursiveDefinitions(recursiveDefs);
    }
```

### DuplicatedCode
Duplicated code
in `base/src/main/java/org/arend/module/serialization/DefinitionDeserialization.java`
#### Snippet
```java
        if (expression instanceof SmallIntegerExpression && ((SmallIntegerExpression) expression).getInteger() == 0) {
          return new ConstructorExpressionPattern(new ConCallExpression(Prelude.ZERO, Levels.EMPTY, Collections.emptyList(), Collections.emptyList()), patterns);
        }
        if (expression instanceof ConCallExpression) {
          return new ConstructorExpressionPattern((ConCallExpression) expression, patterns);
        }
        if (expression instanceof ClassCallExpression) {
          return new ConstructorExpressionPattern((ClassCallExpression) expression, patterns);
        }
        if (expression instanceof SigmaExpression) {
          return new ConstructorExpressionPattern((SigmaExpression) expression, patterns);
        }
```

### DuplicatedCode
Duplicated code
in `base/src/main/java/org/arend/module/serialization/DefinitionSerialization.java`
#### Snippet
```java
    builder.setHasEnclosingClass(definition.getEnclosingClass() != null);
    builder.addAllParam(defSerializer.writeParameters(definition.getParameters()));
    if (definition.getParametersTypecheckingOrder() != null) {
      builder.addAllParametersTypecheckingOrder(definition.getParametersTypecheckingOrder());
    }
    builder.addAllGoodThisParameters(definition.getGoodThisParameters());
    for (Definition.TypeClassParameterKind kind : definition.getTypeClassParameters()) {
      builder.addTypeClassParameters(writeTypeClassParameterKind(kind));
    }
    builder.addAllParametersLevels(writeParametersLevels(defSerializer, definition.getParametersLevels()));
    for (Definition recursiveDefinition : definition.getRecursiveDefinitions()) {
      builder.addRecursiveDefinition(myCallTargetIndexProvider.getDefIndex(recursiveDefinition));
    }
```

### DuplicatedCode
Duplicated code
in `base/src/main/java/org/arend/prelude/Prelude.java`
#### Snippet
```java
    consumer.accept(NAT);
    consumer.accept(PLUS);
    consumer.accept(MINUS);
    consumer.accept(MUL);
    consumer.accept(ZERO);
    consumer.accept(SUC);
    consumer.accept(FIN);
    consumer.accept(FIN_FROM_NAT);
    consumer.accept(INT);
    consumer.accept(POS);
    consumer.accept(NEG);
    consumer.accept(STRING);
    consumer.accept(INTERVAL);
    consumer.accept(LEFT);
    consumer.accept(RIGHT);
    consumer.accept(SQUEEZE);
    consumer.accept(SQUEEZE_R);
    consumer.accept(PATH);
    consumer.accept(PATH_CON);
```

### DuplicatedCode
Duplicated code
in `base/src/main/java/org/arend/term/concrete/BaseConcreteExpressionVisitor.java`
#### Snippet
```java
    } else if (pattern instanceof Concrete.ConstructorPattern) {
      for (Concrete.Pattern subPattern : ((Concrete.ConstructorPattern) pattern).getPatterns()) {
        visitPattern(subPattern, params);
      }
    } else if (pattern instanceof Concrete.TuplePattern) {
      for (Concrete.Pattern subPattern : ((Concrete.TuplePattern) pattern).getPatterns()) {
        visitPattern(subPattern, params);
      }
    }
```

### DuplicatedCode
Duplicated code
in `base/src/main/java/org/arend/term/concrete/SearchConcreteVisitor.java`
#### Snippet
```java
        R result = visitParameters(field.getParameters(), params);
        if (result != null) return null;
        result = field.getResultType().accept(this, params);
        if (result != null) return null;
        if (field.getResultTypeLevel() != null) {
          result = field.getResultTypeLevel().accept(this, params);
          if (result != null) return null;
        }
```

### DuplicatedCode
Duplicated code
in `base/src/main/java/org/arend/term/prettyprint/PrettyPrintVisitor.java`
#### Snippet
```java
    prettyPrintNameWithPrecedence(def.getData());

    if (def.getPLevelParameters() != null) {
      myBuilder.append(" ");
      prettyPrintLevelParameters(def.getPLevelParameters(), true);
    }
    if (def.getHLevelParameters() != null) {
      myBuilder.append(" ");
      prettyPrintLevelParameters(def.getHLevelParameters(), false);
    }
```

### DuplicatedCode
Duplicated code
in `base/src/main/java/org/arend/term/prettyprint/ToAbstractVisitor.java`
#### Snippet
```java
    DefinitionRenamer definitionRenamer = config.getDefinitionRenamer();
    if (definitionRenamer == null) {
      definitionRenamer = new ConflictDefinitionRenamer();
    }
    if (definitionRenamer instanceof ConflictDefinitionRenamer) {
      expression.accept((ConflictDefinitionRenamer) definitionRenamer, null);
    }
    CollectFreeVariablesVisitor collector = new CollectFreeVariablesVisitor(definitionRenamer);
    Set<Variable> variables = new HashSet<>();
```

### DuplicatedCode
Duplicated code
in `base/src/main/java/org/arend/typechecking/implicitargs/equations/TwoStageEquations.java`
#### Snippet
```java
      Pair<Expression, ExprSubstitution> pair = reverseSubstitution(expr1);
      if (pair != null) {
        origExpr1 = expr1 = pair.proj1;
        SubstVisitor substVisitor = new SubstVisitor(pair.proj2, LevelSubstitution.EMPTY, false);
        expr2 = expr2.accept(substVisitor, null);
        origExpr2 = normalize ? origExpr2.accept(substVisitor, null) : expr2;
      }
```

### DuplicatedCode
Duplicated code
in `base/src/main/java/org/arend/typechecking/implicitargs/equations/TwoStageEquations.java`
#### Snippet
```java
      addLevelEquation(level1.getVar(), level2.getVar(), level2.getConstant() - level1.getConstant(), level2.getMaxConstant() - level1.getConstant(), sourceNode);
      if (level1.withMaxConstant() && level1.getMaxConstant() > level2.getMaxConstant()) {
        addLevelEquation(null, level2.getVar(), level2.getConstant() - level1.getMaxConstant(), -1, sourceNode);
      }
```

### DuplicatedCode
Duplicated code
in `base/src/main/java/org/arend/typechecking/patternmatching/ConditionsChecking.java`
#### Snippet
```java
      List<Expression> defCallArgs1 = new ArrayList<>();
      for (DependentLink link3 = definition.getParameters(); link3.hasNext(); link3 = link3.getNext()) {
        defCallArgs1.add(link3 == link1 ? (isLeft1 ? ExpressionFactory.Left() : ExpressionFactory.Right()) : new ReferenceExpression(link3));
      }
```

### DuplicatedCode
Duplicated code
in `base/src/main/java/org/arend/typechecking/visitor/DesugarVisitor.java`
#### Snippet
```java
        Referable ref = pattern instanceof Concrete.NamePattern ? ((Concrete.NamePattern) pattern).getRef() : null;
        if (ref == null && pattern.getAsReferable() != null) ref = pattern.getAsReferable().referable;
        if (ref == null) ref = new LocalReferable("p" + j++);
        Concrete.Expression type = pattern instanceof Concrete.NamePattern ? ((Concrete.NamePattern) pattern).type : pattern.getAsReferable() != null ? pattern.getAsReferable().type : null;
        newParams.add(type != null ? new Concrete.TelescopeParameter(pattern.getData(), pattern.isExplicit(), Collections.singletonList(ref), type.accept(this, null), false) : new Concrete.NameParameter(pattern.getData(), pattern.isExplicit(), ref));
```

## RuleId[id=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return list but the return type is array
in `api/src/main/java/org/arend/ext/typechecking/MetaDefinition.java`
#### Snippet
```java

  /**
   * @return the list of indices of arguments that should be desugared, or {@code null} if all arguments should be desugared.
   */
  default int @Nullable [] desugarArguments(@NotNull List<? extends ConcreteArgument> arguments) {
```

## RuleId[id=SuspiciousListRemoveInLoop]
### SuspiciousListRemoveInLoop
Suspicious 'List.remove()' in loop
in `base/src/main/java/org/arend/typechecking/termination/BaseCallGraph.java`
#### Snippet
```java
        if (shorterBehavior != null) {
          List<Integer> shorterIndices = new LinkedList<>(indices);
          shorterIndices.remove(i);
          List<Integer> termOrder = findTerminationOrder(shorterBehavior, shorterIndices);
          if (termOrder != null) {
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `base/src/main/java/org/arend/library/error/LibraryError.java`
#### Snippet
```java

  public static LibraryError incorrectExtensionClass(String libraryName) {
    return new LibraryError("Extension main class does not implement " + ArendExtension.class.toString(), Stream.of(libraryName));
  }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `base/src/main/java/org/arend/typechecking/termination/RecursiveBehavior.java`
#### Snippet
```java
      values.append(StringFormat.rightPad(label.length() + 1, CallMatrix.rToChar(r)));
    }
    return labels.toString() + '\n' + values.toString();
  }
}
```

## RuleId[id=NullableProblems]
### NullableProblems
Primitive type members cannot be annotated
in `api/src/main/java/org/arend/ext/serialization/SerializableKey.java`
#### Snippet
```java
  }

  public abstract @NotNull byte[] serialize(@NotNull ArendSerializer serializer, T object);

  public abstract @NotNull T deserialize(@NotNull ArendDeserializer deserializer, @NotNull byte[] data) throws DeserializationException;
```

### NullableProblems
Primitive type members cannot be annotated
in `api/src/main/java/org/arend/ext/serialization/SerializableKey.java`
#### Snippet
```java
  public abstract @NotNull byte[] serialize(@NotNull ArendSerializer serializer, T object);

  public abstract @NotNull T deserialize(@NotNull ArendDeserializer deserializer, @NotNull byte[] data) throws DeserializationException;
}

```

## RuleId[id=ConstantValue]
### ConstantValue
Value `fKind` is always 'null'
in `base/src/main/java/org/arend/module/serialization/ModuleDeserialization.java`
#### Snippet
```java
      case FUNCTION -> {
        var fKind = defProto.getFunction().getKind();
        return fKind == DefinitionProtos.Definition.FunctionKind.INSTANCE ? GlobalReferable.Kind.INSTANCE : fKind == DefinitionProtos.Definition.FunctionKind.COCLAUSE || fKind == DefinitionProtos.Definition.FunctionKind.COCLAUSE_LEMMA ? GlobalReferable.Kind.COCLAUSE_FUNCTION : GlobalReferable.Kind.FUNCTION;
      }
      case CONSTRUCTOR -> {
```

### ConstantValue
Value `fKind` is always 'null'
in `base/src/main/java/org/arend/module/serialization/ModuleDeserialization.java`
#### Snippet
```java
      case FUNCTION -> {
        var fKind = defProto.getFunction().getKind();
        return fKind == DefinitionProtos.Definition.FunctionKind.INSTANCE ? GlobalReferable.Kind.INSTANCE : fKind == DefinitionProtos.Definition.FunctionKind.COCLAUSE || fKind == DefinitionProtos.Definition.FunctionKind.COCLAUSE_LEMMA ? GlobalReferable.Kind.COCLAUSE_FUNCTION : GlobalReferable.Kind.FUNCTION;
      }
      case CONSTRUCTOR -> {
```

### ConstantValue
Value `fKind` is always 'null'
in `base/src/main/java/org/arend/module/serialization/ModuleDeserialization.java`
#### Snippet
```java
      case FUNCTION -> {
        var fKind = defProto.getFunction().getKind();
        return fKind == DefinitionProtos.Definition.FunctionKind.INSTANCE ? GlobalReferable.Kind.INSTANCE : fKind == DefinitionProtos.Definition.FunctionKind.COCLAUSE || fKind == DefinitionProtos.Definition.FunctionKind.COCLAUSE_LEMMA ? GlobalReferable.Kind.COCLAUSE_FUNCTION : GlobalReferable.Kind.FUNCTION;
      }
      case CONSTRUCTOR -> {
```

### ConstantValue
Value `isExplicit` is always 'true'
in `base/src/main/java/org/arend/term/prettyprint/ToAbstractVisitor.java`
#### Snippet
```java
        Concrete.Expression mappedExpression = myRenamer.getConcreteExpression(refExpr.getBinding());
        if (mappedExpression != null) {
          arguments.add(new Concrete.Argument(mappedExpression, isExplicit));
          return;
        }
```

### ConstantValue
Condition `term != null` is always `true`
in `base/src/main/java/org/arend/typechecking/subexpr/CorrespondedSubDefVisitor.java`
#### Snippet
```java
        }
      }
      return term != null && coreBody instanceof Expression ? term.accept(visitor, (Expression) coreBody) : null;
    } else if (body instanceof Concrete.ElimFunctionBody && coreBody instanceof ElimBody) {
      // Assume they have the same order.
```

### ConstantValue
Value `isEmpty` is always 'true'
in `base/src/main/java/org/arend/typechecking/patternmatching/ElimTypechecking.java`
#### Snippet
```java
      conPatterns = new ArrayList<>(2);
      if (isEmpty == null || isEmpty.equals(true)) {
        conPatterns.add(new ConstructorExpressionPattern(new FunCallExpression(Prelude.EMPTY_ARRAY, LevelPair.STD, null, elementsType), null, isEmpty, Collections.emptyList()));
      }
      if (isEmpty == null || isEmpty.equals(false)) {
```

### ConstantValue
Value `isEmpty` is always 'false'
in `base/src/main/java/org/arend/typechecking/patternmatching/ElimTypechecking.java`
#### Snippet
```java
        Expression length = ((ClassCallExpression) type).getAbsImplementationHere(Prelude.ARRAY_LENGTH);
        ClassCallExpression.ClassCallBinding thisBinding = ((ClassCallExpression) type).getThisBinding();
        conPatterns.add(new ConstructorExpressionPattern(new FunCallExpression(Prelude.ARRAY_CONS, LevelPair.STD, length == null ? FieldCallExpression.make(Prelude.ARRAY_LENGTH, new ReferenceExpression(thisBinding)) : length, elementsType), thisBinding, isEmpty, Collections.emptyList()));
      }
    } else {
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `cli/src/main/java/org/arend/frontend/repl/jline/Completers.java`
#### Snippet
```java

/**
 * Ported from https://github.com/jline/jline3/blob/81e38b948f8fce71b9f572b9b7a4414c8d6d63d9/builtins/src/main/java/org/jline/builtins/Completers.java
 * Avoid introducing a very big dependency (jline groovy).
 */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `cli/src/main/java/org/arend/frontend/repl/CommonCliRepl.java`
#### Snippet
```java
  public @NotNull Path pwd = Paths.get("").toAbsolutePath();
  /**
   * See https://gist.github.com/ice1000/a915b6fcbc6f90b0c3c65db44dab29cc
   */
  @Language("TEXT")
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `base/src/main/java/org/arend/typechecking/doubleChecker/CoreDefinitionChecker.java`
#### Snippet
```java
    }

    if (!checkSquasher(definition.getSquasher(), definition, definition.getSort())) {
      return false;
    }
```

## RuleId[id=BlockingMethodInNonBlockingContext]
### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `cli/src/main/java/org/arend/frontend/ui/CliSession.java`
#### Snippet
```java
    System.out.flush();
    try {
      String line = reader.readLine();
      if (line == null) {
        callback.accept(false);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `cli/src/main/java/org/arend/frontend/repl/jline/Completers.java`
#### Snippet
```java
    protected boolean accept(Path path) {
      try {
        return !Files.isHidden(path);
      } catch (IOException e) {
        return false;
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `cli/src/main/java/org/arend/frontend/repl/jline/Completers.java`
#### Snippet
```java
          current = getUserDir();
        }
        try (DirectoryStream<Path> directory = Files.newDirectoryStream(current, this::accept)) {
          directory.forEach(p -> {
            String value = curBuf + p.getFileName().toString();
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `cli/src/main/java/org/arend/frontend/source/ZipFileRawSource.java`
#### Snippet
```java
  @Override
  protected @NotNull InputStream getInputStream() throws IOException {
    return myFile.getInputStream(myEntry);
  }
}
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `cli/src/main/java/org/arend/frontend/source/FileRawSource.java`
#### Snippet
```java
  public long getTimeStamp() {
    try {
      return Files.getLastModifiedTime(myFile).toMillis();
    } catch (IOException e) {
      return 0;
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `cli/src/main/java/org/arend/frontend/source/FileRawSource.java`
#### Snippet
```java
  @Override
  protected InputStream getInputStream() throws IOException {
    return Files.newInputStream(myFile);
  }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `cli/src/main/java/org/arend/frontend/repl/jline/JLineCliRepl.java`
#### Snippet
```java
      // Assuming user.home exists
      if (Files.notExists(dir) || Files.isRegularFile(dir)) {
        Files.deleteIfExists(dir);
        Files.createDirectory(dir);
      }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `cli/src/main/java/org/arend/frontend/repl/jline/JLineCliRepl.java`
#### Snippet
```java
      if (Files.notExists(dir) || Files.isRegularFile(dir)) {
        Files.deleteIfExists(dir);
        Files.createDirectory(dir);
      }
      if (Files.notExists(history) || Files.isDirectory(history)) {
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `cli/src/main/java/org/arend/frontend/repl/jline/JLineCliRepl.java`
#### Snippet
```java
      }
      if (Files.notExists(history) || Files.isDirectory(history)) {
        Files.deleteIfExists(history);
        Files.createFile(history);
      }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `cli/src/main/java/org/arend/frontend/repl/jline/JLineCliRepl.java`
#### Snippet
```java
      if (Files.notExists(history) || Files.isDirectory(history)) {
        Files.deleteIfExists(history);
        Files.createFile(history);
      }
    } catch (IOException e) {
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `cli/src/main/java/org/arend/frontend/repl/CommonCliRepl.java`
#### Snippet
```java
    try {
      if (Files.notExists(config)) {
        Files.createFile(config);
      }
      var properties = new ReplConfig();
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `cli/src/main/java/org/arend/frontend/repl/CommonCliRepl.java`
#### Snippet
```java
      properties.prompt = prompt;
      properties.prettyPrinterFlags = new ArrayList<>(myPrettyPrinterFlags);
      try (var out = Files.newOutputStream(config)) {
        new YAMLMapper().writeValue(out, properties);
      }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `cli/src/main/java/org/arend/frontend/library/ZipSourceLibrary.java`
#### Snippet
```java

    LibraryConfig config;
    try (InputStream stream = myZipFile.getInputStream(yamlEntry)) {
      config = new YAMLMapper().readValue(stream, LibraryConfig.class);
    } catch (IOException e) {
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `cli/src/main/java/org/arend/frontend/BaseCliFrontend.java`
#### Snippet
```java
    if (!requestedModules.isEmpty()) {
      try {
        Files.createDirectories(outDir);
      } catch (IOException e) {
        e.printStackTrace();
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `base/src/main/java/org/arend/util/FileUtils.java`
#### Snippet
```java
  public static void getModules(Path path, String ext, Collection<ModulePath> modules, ErrorReporter errorReporter) {
    try {
      Files.walkFileTree(path, new SimpleFileVisitor<>() {
        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `base/src/main/java/org/arend/source/FileBinarySource.java`
#### Snippet
```java
  @Override
  protected OutputStream getOutputStream() throws IOException {
    Files.createDirectories(myFile.getParent());
    return Files.newOutputStream(myFile, StandardOpenOption.CREATE);
  }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `base/src/main/java/org/arend/source/FileBinarySource.java`
#### Snippet
```java
  protected OutputStream getOutputStream() throws IOException {
    Files.createDirectories(myFile.getParent());
    return Files.newOutputStream(myFile, StandardOpenOption.CREATE);
  }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `base/src/main/java/org/arend/source/FileBinarySource.java`
#### Snippet
```java
  public long getTimeStamp() {
    try {
      return Files.getLastModifiedTime(myFile).toMillis();
    } catch (IOException e) {
      return 0;
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `base/src/main/java/org/arend/source/FileBinarySource.java`
#### Snippet
```java
  public boolean delete(SourceLibrary library) {
    try {
      Files.deleteIfExists(myFile);
      return true;
    } catch (IOException e) {
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `base/src/main/java/org/arend/source/FileBinarySource.java`
#### Snippet
```java
  @Override
  protected InputStream getInputStream() throws IOException {
    return Files.newInputStream(myFile);
  }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `base/src/main/java/org/arend/source/ZipFileBinarySource.java`
#### Snippet
```java
  @Override
  protected @Nullable InputStream getInputStream() throws IOException {
    return myFile.getInputStream(myEntry);
  }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `base/src/main/java/org/arend/library/classLoader/FileClassLoaderDelegate.java`
#### Snippet
```java
    Path file = myRoot.resolve(name.replace('.', File.separatorChar) + ".class");
    try {
      return Files.isRegularFile(file) ? Files.readAllBytes(file) : null;
    } catch (IOException e) {
      throw new ClassNotFoundException("An exception happened during loading of class " + name, e);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `base/src/main/java/org/arend/library/classLoader/ZipClassLoaderDelegate.java`
#### Snippet
```java
    }

    try (InputStream stream = zipFile.getInputStream(entry)) {
      return stream.readAllBytes();
    } catch (IOException e) {
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `base/src/main/java/org/arend/library/classLoader/ZipClassLoaderDelegate.java`
#### Snippet
```java

    try (InputStream stream = zipFile.getInputStream(entry)) {
      return stream.readAllBytes();
    } catch (IOException e) {
      throw new ClassNotFoundException("An exception happened during loading of class " + name, e);
```

