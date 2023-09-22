package io.github.martinwitt.spoon_analyzer.badsmells.non_protected_constructor_In_abstract_class;

import io.github.martinwitt.spoon_analyzer.BadSmell;
import io.github.martinwitt.spoon_analyzer.LocalAnalyzer;
import io.github.martinwitt.spoon_analyzer.LocalRefactor;
import java.util.ArrayList;
import java.util.List;
import spoon.reflect.declaration.CtConstructor;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.ModifierKind;
import spoon.reflect.visitor.filter.TypeFilter;

public class NonProtectedConstructorInAbstractClassAnalyzer
    implements LocalAnalyzer, LocalRefactor<NonProtectedConstructorInAbstractClass> {

  @Override
  public List<BadSmell> analyze(CtType<?> clazz) {
    List<BadSmell> badSmells = new ArrayList<>();
    if (!clazz.isAbstract()) {
      return badSmells;
    }
    List<CtConstructor<?>> elements = clazz.getElements(new TypeFilter<>(CtConstructor.class));
    for (CtConstructor<?> ctConstructor : elements) {
      if (!ctConstructor.isProtected() && ctConstructor.isPublic() && !ctConstructor.isImplicit()) {
        badSmells.add(new NonProtectedConstructorInAbstractClass(clazz, ctConstructor));
      }
    }
    return badSmells;
  }

  @Override
  public void refactor(NonProtectedConstructorInAbstractClass badSmell) {
    badSmell.getCtConstructor().removeModifier(ModifierKind.PUBLIC);
    badSmell.getCtConstructor().addModifier(ModifierKind.PROTECTED);
  }
}
