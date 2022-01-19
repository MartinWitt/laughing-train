package xyz.keksdose.spoon.code_solver.transformations.self;

import java.util.List;

import spoon.reflect.code.CtInvocation;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.reference.CtTypeReference;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.transformations.TransformationProcessor;

public class StringBuilderToString extends TransformationProcessor<CtInvocation<?>> {

  public StringBuilderToString(ChangeListener listener) {
    super(listener);
  }

  @Override
  public void process(CtInvocation<?> element) {
    if(targetIsStringType(element) && element.getTarget() instanceof CtInvocation) {
        CtInvocation<?> invocation = (CtInvocation<?>) element.getTarget();
        if (targetIsStringBuilder(invocation) && stringBuilderHasMethod(element)) {
          element.setTarget(invocation.getTarget());
        }
        }
       }


  private boolean targetIsStringType(CtInvocation<?> element) {
    return element.getTarget() != null
        && element.getTarget().getType().equals(element.getFactory().Type().stringType());
  }

  private boolean targetIsStringBuilder(CtInvocation<?> element) {
    return element.getTarget() != null
        && element.getTarget().getType().getSimpleName().equals("StringBuilder");
  }
  private boolean stringBuilderHasMethod(CtInvocation<?> element) {
    String methodName = element.getExecutable().getSimpleName();
    List<CtTypeReference<?>> parameter = element.getExecutable().getParameters();
    CtClass<?> stringBuilder = getFactory().Class().get(StringBuilder.class);
    return stringBuilder.getMethodsByName(methodName).stream()
        .anyMatch(method -> method.getParameters().size() == parameter.size());
  }
  }
  
