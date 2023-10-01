package xyz.keksdose.spoon.code_solver.analyzer.spoon.rules;

import io.github.martinwitt.laughing_train.domain.entity.AnalyzerResult;
import io.github.martinwitt.laughing_train.spoonutils.InvocationMatcher;
import java.util.ArrayList;
import java.util.List;
import spoon.reflect.code.*;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtType;
import spoon.reflect.factory.Factory;
import spoon.reflect.reference.CtExecutableReference;
import spoon.reflect.visitor.filter.TypeFilter;
import xyz.keksdose.spoon.code_solver.analyzer.spoon.SpoonAnalyzerResult;
import xyz.keksdose.spoon.code_solver.analyzer.spoon.SpoonRefactoring;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.history.MarkdownString;
import xyz.keksdose.spoon.code_solver.transformations.BadSmell;

public class IndexOfReplaceableByContains extends SpoonRefactoring {

  private final ThreadLocal<InvocationMatcher> matcher = new ThreadLocal<InvocationMatcher>();

  private static final BadSmell BAD_SMELL =
      new BadSmell(
          MarkdownString.fromMarkdown("IndexOfReplaceableByContains"),
          MarkdownString.fromMarkdown(
              "The `indexOf` method returns -1 if the substring is not found. This can be replaced by the contains method."));

  /**
   * Creates a new refactoring with a given result.
   *
   * @param result the result of an analysis run.
   */
  public IndexOfReplaceableByContains(AnalyzerResult result) {
    super(result);
    matcher.set(new InvocationMatcher("java.lang.String", "indexOf"));
  }

  @SuppressWarnings({"rawtypes", "unchecked"})
  @Override
  public void refactor(ChangeListener listener, CtType<?> type) {
    Factory factory = type.getFactory();
    for (ResultRecord indexMinusOnePair : getIndexMinusOnePairs(type)) {
      if (toPosition(indexMinusOnePair.indexOfCall().getPosition()).equals(result.position())) {
        CtExpression<?> indexOfCall = indexMinusOnePair.indexOfCall();
        CtBinaryOperator parent = indexOfCall.getParent(CtBinaryOperator.class);
        CtBinaryOperator oldParent = parent.clone();
        if (indexOfCall instanceof CtInvocation<?> invocation) {
          CtExecutableReference containsCalls = getContainsCalls(factory);
          invocation.setExecutable(containsCalls);
          parent.replace(
              factory.createUnaryOperator().setKind(UnaryOperatorKind.NOT).setOperand(invocation));
          Change change =
              new Change(
                  BAD_SMELL,
                  MarkdownString.fromMarkdown(
                      "Converted `%s` to index of invocation `%s`"
                          .formatted(oldParent, invocation)),
                  type,
                  result);
          listener.setChanged(type, change);
        }
      }
    }
  }

  private static CtExecutableReference<?> getContainsCalls(Factory factory) {
    return factory
        .createExecutableReference()
        .setDeclaringType(factory.Type().createReference("java.lang.String"))
        .setSimpleName("contains");
  }

  @Override
  public List<BadSmell> getHandledBadSmells() {
    return List.of(BAD_SMELL);
  }

  @Override
  public List<SpoonAnalyzerResult> analyze(String sourceRoot, CtType<?> ctType) {
    List<SpoonAnalyzerResult> results = new ArrayList<>();
    List<ResultRecord> indexMinusOnePairs = getIndexMinusOnePairs(ctType);
    for (ResultRecord indexMinusOnePair : indexMinusOnePairs) {
      results.add(
          SpoonAnalyzerResult.createResult(
              BAD_SMELL.getName().asText(),
              ctType,
              "The indexOf call %s can be replaced by contains."
                  .formatted(indexMinusOnePair.indexOfCall),
              "The indexOf call `%s` can be replaced by contains."
                  .formatted(indexMinusOnePair.indexOfCall),
              indexMinusOnePair.indexOfCall,
              sourceRoot));
    }
    return results;
  }

  private boolean isIndexOfCall(CtExpression<?> expression) {
    if (expression instanceof CtInvocation<?> invocation) {
      return matcher.get().matches(invocation);
    }
    return false;
  }

  private boolean isMinusOne(CtExpression<?> expression) {
    if (expression instanceof CtUnaryOperator<?> operator
        && operator.getKind().equals(UnaryOperatorKind.NEG)) {
      return operator.getOperand() instanceof CtLiteral<?> literal && literal.getValue().equals(1);
    }
    return false;
  }

  record ResultRecord(CtExpression<?> indexOfCall, CtExpression<?> minusOne) {}

  private List<ResultRecord> getIndexMinusOnePairs(CtElement clazz) {
    List<ResultRecord> resultRecords = new ArrayList<>();
    List<CtBinaryOperator<?>> list = clazz.getElements(new TypeFilter<>(CtBinaryOperator.class));
    for (CtBinaryOperator<?> ctBinaryOperator : list) {
      CtExpression<?> rightHandOperand = ctBinaryOperator.getRightHandOperand();
      CtExpression<?> leftHandOperand = ctBinaryOperator.getLeftHandOperand();
      if (isIndexOfCall(leftHandOperand) && isMinusOne(rightHandOperand)) {
        resultRecords.add(new ResultRecord(leftHandOperand, rightHandOperand));
      } else if (isIndexOfCall(rightHandOperand) && isMinusOne(leftHandOperand)) {
        resultRecords.add(new ResultRecord(rightHandOperand, leftHandOperand));
      }
    }
    return resultRecords;
  }
}
