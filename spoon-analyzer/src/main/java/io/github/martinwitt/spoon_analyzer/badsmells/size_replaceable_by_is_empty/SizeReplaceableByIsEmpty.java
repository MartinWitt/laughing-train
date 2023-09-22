package io.github.martinwitt.spoon_analyzer.badsmells.size_replaceable_by_is_empty;

import io.github.martinwitt.spoon_analyzer.BadSmell;
import io.github.martinwitt.spoon_analyzer.BadSmellVisitor;
import spoon.reflect.code.CtBinaryOperator;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.declaration.CtType;

public class SizeReplaceableByIsEmpty implements BadSmell {
  private static final String NAME = "SizeReplaceableByIsEmpty";
  private static final String DESCRIPTION =
      "Checking if an collection is empty by comparing its size to 0 is redundant. Use isEmpty() instead.";
  private final CtType<?> affectedType;
  private final CtBinaryOperator<?> element;
  private final CtInvocation<?> sizeInvocation;
  private final CtExpression<?> zeroLiteral;

  public SizeReplaceableByIsEmpty(
      CtType<?> affectedType,
      CtBinaryOperator<?> element,
      CtInvocation<?> sizeInvocation,
      CtExpression<?> zeroLiteral) {
    this.affectedType = affectedType;
    this.element = element;
    this.sizeInvocation = sizeInvocation;
    this.zeroLiteral = zeroLiteral;
  }

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public String getDescription() {
    return DESCRIPTION;
  }

  @Override
  public CtType<?> getAffectedType() {
    return affectedType;
  }

  public CtBinaryOperator<?> getElement() {
    return element;
  }

  public CtInvocation<?> getSizeInvocation() {
    return sizeInvocation;
  }

  public CtExpression<?> getZeroLiteral() {
    return zeroLiteral;
  }

  @Override
  public void fix() {
    new SizeReplaceableByIsEmptyAnalyzer().refactor(this);
  }

  @Override
  public boolean isFixable() {
    return true;
  }

  @Override
  public <T> T accept(BadSmellVisitor<T> visitor) {
    return visitor.visit(this);
  }
}
