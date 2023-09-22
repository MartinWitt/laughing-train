package io.github.martinwitt.spoon_analyzer.badsmells.private_final_method;

import io.github.martinwitt.spoon_analyzer.BadSmell;
import io.github.martinwitt.spoon_analyzer.BadSmellVisitor;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtType;

public class PrivateFinalMethod implements BadSmell {

  private static final String NAME = "PrivateFinalMethod";

  private static final String DESCRIPTION =
      "Private method cant be overridden, so there is no reason for the final. Less modifiers are easier to read.";

  private CtType<?> affectedType;
  private CtMethod<?> affectedMethod;

  /**
   * @param affectedType
   * @param affectedMethod
   */
  public PrivateFinalMethod(CtType<?> affectedType, CtMethod<?> affectedMethod) {
    this.affectedType = affectedType;
    this.affectedMethod = affectedMethod;
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

  public CtMethod<?> getAffectedMethod() {
    return affectedMethod;
  }

  @Override
  public void fix() {
    new PrivateFinalMethodAnalyzer().refactor(this);
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
