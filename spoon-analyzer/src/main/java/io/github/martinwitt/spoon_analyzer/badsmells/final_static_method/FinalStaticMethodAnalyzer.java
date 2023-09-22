package io.github.martinwitt.spoon_analyzer.badsmells.final_static_method;

import io.github.martinwitt.laughing_train.spoonutils.matcher.Matchers;
import io.github.martinwitt.spoon_analyzer.BadSmell;
import io.github.martinwitt.spoon_analyzer.LocalAnalyzer;
import java.util.ArrayList;
import java.util.List;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtType;
import spoon.reflect.visitor.Filter;

public class FinalStaticMethodAnalyzer implements LocalAnalyzer {

  @Override
  public List<BadSmell> analyze(CtType<?> clazz) {
    List<BadSmell> badSmells = new ArrayList<>();
    List<CtMethod<?>> elements = clazz.getElements(new FinalStaticMethodFilter());
    for (CtMethod<?> method : elements) {
      badSmells.add(new FinalStaticMethod(method, clazz));
    }
    return badSmells;
  }

  /** A filter that matches final static methods. */
  private static class FinalStaticMethodFilter implements Filter<CtMethod<?>> {

    @Override
    public boolean matches(CtMethod<?> element) {
      return Matchers.allOf(Matchers.isFinal(), (Matchers.isStatic())).matches(element);
    }
  }
}
