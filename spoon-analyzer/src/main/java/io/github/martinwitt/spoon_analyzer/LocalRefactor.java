package io.github.martinwitt.spoon_analyzer;

public interface LocalRefactor<T extends BadSmell> {

  /** Refactors the given bad smell. */
  void refactor(T badSmell);
}
