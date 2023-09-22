package io.github.martinwitt.laughing_train.spoonutils;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.apache.commons.lang3.tuple.Pair;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.code.CtTypeAccess;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.Filter;

/**
 * A matcher that checks if a given {@link CtInvocation} object matches a specified target type,
 * method name, and argument types.
 */
public class InvocationMatcher implements Filter<CtInvocation<?>> {
  private final String fqTargetType;
  private final String methodName;
  private final String[] argsFQN;

  /**
   * Creates a new {@link InvocationMatcher} object with the specified target type, method name, and
   * argument types.
   *
   * @param fqTargetType the fully qualified name of the target type
   * @param methodName the name of the method
   * @param argsFQN the fully qualified names of the argument types
   */
  public InvocationMatcher(String fqTargetType, String methodName, String... argsFQN) {
    this.fqTargetType = fqTargetType;
    this.methodName = methodName;
    this.argsFQN = argsFQN;
  }

  /**
   * Checks if the specified {@link CtInvocation} object matches the target type, method name, and
   * argument types of this {@link InvocationMatcher}.
   *
   * @param element the {@link CtInvocation} object to check
   * @return true if the invocation matches, false otherwise
   */
  public boolean matches(CtInvocation<?> element) {
    if (element == null) {
      return false;
    }

    // Check if the target type matches
    CtExpression<?> target = element.getTarget();
    if (target == null || target.getType() == null) {
      return false;
    }
    if (target instanceof CtTypeAccess access) {
      if (!access.getAccessedType().getQualifiedName().equals(fqTargetType)) {
        return false;
      }
    } else {
      if (!target.getType().getQualifiedName().equals(fqTargetType)) {
        return false;
      }
    }

    // Check if the method name matches
    if (Optional.ofNullable(element.getExecutable())
        .map(v -> v.getExecutableDeclaration())
        .filter(v -> v.getSimpleName().equals(methodName))
        .isEmpty()) {
      return false;
    }

    // Check if the argument types match
    if (argsFQN == null || argsFQN.length == 0) {
      return true;
    }
    if (element.getArguments().size() != argsFQN.length) {
      return false;
    }
    if (element.getArguments().stream().anyMatch(arg -> arg.getType() == null)) {
      return false;
    }
    List<Pair<CtTypeReference<?>, CtExpression<?>>> zipped = new ArrayList<>();
    for (int i = 0; i < argsFQN.length && i < element.getArguments().size(); i++) {
      zipped.add(
          Pair.of(element.getFactory().createReference(argsFQN[i]), element.getArguments().get(i)));
    }
    return zipped.stream().allMatch(pair -> pair.getRight().getType().isSubtypeOf(pair.getLeft()));
  }
}
