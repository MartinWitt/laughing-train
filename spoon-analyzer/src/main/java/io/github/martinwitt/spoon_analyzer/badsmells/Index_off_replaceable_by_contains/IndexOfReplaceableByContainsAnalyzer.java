package io.github.martinwitt.spoon_analyzer.badsmells.Index_off_replaceable_by_contains;

import io.github.martinwitt.laughing_train.spoonutils.InvocationMatcher;
import io.github.martinwitt.spoon_analyzer.BadSmell;
import io.github.martinwitt.spoon_analyzer.LocalAnalyzer;
import io.github.martinwitt.spoon_analyzer.LocalRefactor;
import java.util.ArrayList;
import java.util.List;
import spoon.reflect.code.CtBinaryOperator;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.code.CtLiteral;
import spoon.reflect.code.CtUnaryOperator;
import spoon.reflect.code.UnaryOperatorKind;
import spoon.reflect.declaration.CtType;
import spoon.reflect.factory.Factory;
import spoon.reflect.reference.CtExecutableReference;
import spoon.reflect.visitor.filter.TypeFilter;

public class IndexOfReplaceableByContainsAnalyzer
    implements LocalAnalyzer, LocalRefactor<IndexOfReplaceableByContains> {

  private InvocationMatcher matcher;

  public IndexOfReplaceableByContainsAnalyzer() {
    matcher = new InvocationMatcher("java.lang.String", "indexOf");
  }

  @Override
  public List<BadSmell> analyze(CtType<?> clazz) {
    List<BadSmell> badSmells = new ArrayList<>();
    List<CtBinaryOperator<?>> list = clazz.getElements(new TypeFilter<>(CtBinaryOperator.class));
    for (CtBinaryOperator<?> ctBinaryOperator : list) {
      CtExpression<?> rightHandOperand = ctBinaryOperator.getRightHandOperand();
      CtExpression<?> leftHandOperand = ctBinaryOperator.getLeftHandOperand();
      if (isIndexOfCall(leftHandOperand) && isMinusOne(rightHandOperand)) {
        badSmells.add(new IndexOfReplaceableByContains(clazz, leftHandOperand, rightHandOperand));
      } else if (isIndexOfCall(rightHandOperand) && isMinusOne(leftHandOperand)) {
        badSmells.add(new IndexOfReplaceableByContains(clazz, rightHandOperand, leftHandOperand));
      }
    }
    return badSmells;
  }

  private boolean isIndexOfCall(CtExpression<?> expression) {
    if (expression instanceof CtInvocation innvocation) {
      return matcher.matches(innvocation);
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

  @SuppressWarnings({"rawtypes", "unchecked"})
  @Override
  public void refactor(IndexOfReplaceableByContains badSmell) {
    Factory factory = badSmell.getIndexOfCall().getFactory();
    CtExpression<?> indexOfCall = badSmell.getIndexOfCall();
    CtBinaryOperator parent = indexOfCall.getParent(CtBinaryOperator.class);
    if (indexOfCall instanceof CtInvocation<?> invocation && parent != null) {
      CtExecutableReference containsCalls =
          factory
              .createExecutableReference()
              .setDeclaringType(factory.Type().createReference("java.lang.String"))
              .setSimpleName("contains");
      invocation.setExecutable(containsCalls);
      parent.replace(
          factory.createUnaryOperator().setKind(UnaryOperatorKind.NOT).setOperand(invocation));
    }
  }
}
