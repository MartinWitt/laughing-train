package io.github.martinwitt.spoon_analyzer.badsmells.unnecessary_implements;

import io.github.martinwitt.spoon_analyzer.BadSmell;
import io.github.martinwitt.spoon_analyzer.LocalAnalyzer;
import io.github.martinwitt.spoon_analyzer.LocalRefactor;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import spoon.reflect.declaration.CtType;
import spoon.reflect.reference.CtTypeReference;

public class UnnecessaryImplementsAnalyzer
    implements LocalAnalyzer, LocalRefactor<UnnecessaryImplements> {

  @Override
  public List<BadSmell> analyze(CtType<?> clazz) {
    Set<CtTypeReference<?>> superInterfaces = clazz.getSuperInterfaces();
    ;
    if (superInterfaces.isEmpty()) {
      return List.of();
    }
    List<BadSmell> badSmells = new ArrayList<>();
    for (CtTypeReference<?> ctTypeReference : superInterfaces) {
      for (CtTypeReference<?> needed : superInterfaces) {
        if (ctTypeReference.equals(needed)) {
          continue;
        }
        if (ctTypeReference.isSubtypeOf(needed)) {
          badSmells.add(new UnnecessaryImplements(ctTypeReference, needed, clazz));
        }
      }
    }
    return badSmells;
  }

  @Override
  public void refactor(UnnecessaryImplements badSmell) {
    CtTypeReference<?> notNeededImplements = badSmell.getNotNeededImplements();
    badSmell.getAffectedType().getSuperInterfaces().remove(notNeededImplements);
  }
}
