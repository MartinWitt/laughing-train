package io.github.martinwitt.spoon_analyzer.badsmells.innerclass_may_be_static;

import io.github.martinwitt.spoon_analyzer.BadSmell;
import io.github.martinwitt.spoon_analyzer.LocalAnalyzer;
import io.github.martinwitt.spoon_analyzer.LocalRefactor;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.ModifierKind;
import spoon.reflect.reference.CtExecutableReference;
import spoon.reflect.reference.CtFieldReference;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.filter.TypeFilter;

public class InnerClassMayBeStaticAnalyzer
    implements LocalAnalyzer, LocalRefactor<InnerClassMayBeStatic> {

  @Override
  public List<BadSmell> analyze(CtType<?> clazz) {
    List<BadSmell> badSmells = new ArrayList<>();
    for (CtType<?> innerClazz : clazz.getNestedTypes()) {
      if (innerClazz.isStatic()) {
        continue;
      }
      // get all refereced executables
      if (referencesParentWithField(innerClazz)) {
        continue;
      }
      if (referencesParentWithMethod(innerClazz)) {
        continue;
      }
      if (referencedInnerClassesAreStatic(innerClazz)) {
        continue;
      }
      Set<CtTypeReference<?>> referencedTypes = innerClazz.getReferencedTypes();
      if (referencedTypes.stream().anyMatch(v -> innerClazz.hasParent(v))) {
        continue;
      }
      badSmells.add(new InnerClassMayBeStatic(clazz, innerClazz));
    }
    return badSmells;
  }

  private boolean referencesParentWithMethod(CtType<?> innerClazz) {
    for (CtExecutableReference<?> referencedExecutables :
        innerClazz.getElements(new TypeFilter<>(CtExecutableReference.class))) {
      CtTypeReference<?> declaringType = referencedExecutables.getDeclaringType();
      if (declaringType == null) {
        continue;
      }
      CtType<?> declaration = declaringType.getDeclaration();
      if (declaration == null) {
        continue;
      }
      if (innerClazz.hasParent(declaration)) {
        return true;
      }
    }
    return false;
  }

  private boolean referencesParentWithField(CtType<?> innerClazz) {
    for (CtFieldReference<?> fieldReference :
        innerClazz.getElements(new TypeFilter<>(CtFieldReference.class))) {
      CtTypeReference<?> declaringTypeRef = fieldReference.getDeclaringType();
      if (declaringTypeRef == null) {
        continue;
      }
      CtType<?> type = declaringTypeRef.getTypeDeclaration();
      if (type == null) {
        continue;
      }
      if (innerClazz.hasParent(type)) {
        return true;
      }
    }
    return false;
  }

  private boolean referencedInnerClassesAreStatic(CtType<?> innerClazz) {
    for (CtTypeReference<?> referencedType : innerClazz.getReferencedTypes()) {
      CtType<?> referencedTypeDeclaration = referencedType.getTypeDeclaration();
      if (referencedTypeDeclaration == null) {
        continue;
      }
      if (referencedTypeDeclaration.isStatic() && !referencedTypeDeclaration.isTopLevel()) {
        continue;
      }
      return false;
    }
    return true;
  }

  @Override
  public void refactor(InnerClassMayBeStatic badSmell) {
    badSmell.getInnerClass().addModifier(ModifierKind.STATIC);
  }
}
