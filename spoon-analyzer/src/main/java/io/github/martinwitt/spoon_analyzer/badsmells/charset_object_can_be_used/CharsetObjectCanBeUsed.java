package io.github.martinwitt.spoon_analyzer.badsmells.charset_object_can_be_used;

import io.github.martinwitt.spoon_analyzer.BadSmell;
import io.github.martinwitt.spoon_analyzer.BadSmellVisitor;
import spoon.reflect.code.CtConstructorCall;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.declaration.CtType;

public class CharsetObjectCanBeUsed implements BadSmell {

  private static final String NAME = "CharsetObjectCanBeUsed";
  private static final String DESCRIPTION =
      "The Charset object can be used instead of the String object.";

  private final CtType<?> affectedType;
  private CtInvocation<?> invocation;
  private CtConstructorCall<?> ctorCall;

  public CharsetObjectCanBeUsed(CtType<?> affectedType, CtInvocation<?> invocation) {
    this.affectedType = affectedType;
    this.invocation = invocation;
  }

  public CharsetObjectCanBeUsed(CtType<?> affectedType, CtConstructorCall<?> invocation) {
    this.affectedType = affectedType;
    this.ctorCall = invocation;
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

  /**
   * @return the invocation
   */
  public CtInvocation<?> getInvocation() {
    return invocation;
  }

  /**
   * @return the ctorCall
   */
  public CtConstructorCall<?> getCtorCall() {
    return ctorCall;
  }

  @Override
  public void fix() {
    new CharsetObjectCanBeUsedAnalyzer().refactor(this);
  }

  @Override
  public boolean isFixable() {
    return true;
  }

  @Override
  public String toString() {
    if (invocation == null) {
      return "CharsetObjectCanBeUsed [affectedType="
          + affectedType.getQualifiedName()
          + ", invocation="
          + ctorCall
          + "]";
    }
    return "CharsetObjectCanBeUsed [affectedType="
        + affectedType.getQualifiedName()
        + ", invocation="
        + invocation
        + "]";
  }

  @Override
  public <T> T accept(BadSmellVisitor<T> visitor) {
    return visitor.visit(this);
  }
}
