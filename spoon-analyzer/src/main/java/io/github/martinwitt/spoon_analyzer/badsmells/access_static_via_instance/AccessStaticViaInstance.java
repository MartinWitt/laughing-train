package io.github.martinwitt.spoon_analyzer.badsmells.access_static_via_instance;

import io.github.martinwitt.spoon_analyzer.BadSmell;
import io.github.martinwitt.spoon_analyzer.BadSmellVisitor;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.declaration.CtType;

public class AccessStaticViaInstance implements BadSmell {

  private static final String description =
      "Accessing static methods should be done via the class name, not via an instance.";

  private final CtType<?> affectedCtType;
  private final CtInvocation<?> affectedCtInvocation;

  public AccessStaticViaInstance(CtType<?> affectedCtType, CtInvocation<?> affectedCtInvocation) {
    this.affectedCtType = affectedCtType;
    this.affectedCtInvocation = affectedCtInvocation;
  }

  @Override
  public String getName() {
    return "AccessStaticViaInstance";
  }

  @Override
  public String getDescription() {
    return description;
  }

  @Override
  public CtType<?> getAffectedType() {
    return affectedCtType;
  }

  /**
   * @return the affectedCtInvocation
   */
  public CtInvocation<?> getAffectedCtInvocation() {
    return affectedCtInvocation;
  }

  @Override
  public String toString() {
    return "AccessStaticViaInstance [affectedCtType="
        + affectedCtType.getQualifiedName()
        + ", affectedCtInvocation="
        + affectedCtInvocation
        + "]";
  }

  @Override
  public void fix() {
    new AccessStaticViaInstanceAnalyzer().refactor(this);
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
