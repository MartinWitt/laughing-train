package io.github.martinwitt.spoon_analyzer.docgen;

import io.github.martinwitt.spoon_analyzer.BadSmell;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.instancio.Instancio;
import org.junit.jupiter.api.Test;
import spoon.Launcher;
import spoon.reflect.CtModel;
import spoon.reflect.declaration.CtType;

public class GenerateBadSmells {

  @Test
  void generateBadSmellTable() throws InvocationTargetException, IOException {
    Launcher launcher = new Launcher();
    launcher.addInputResource("src/main/java");
    launcher.getEnvironment().setAutoImports(true);
    launcher.getEnvironment().setNoClasspath(true);
    CtModel model = launcher.buildModel();
    StringBuilder sb = new StringBuilder();
    sb.append("| Bad Smell | Description |").append(System.lineSeparator());
    sb.append("| --- | --- |").append(System.lineSeparator());
    for (CtType<?> type : model.getAllTypes()) {
      if (type.getSuperInterfaces().stream()
          .anyMatch(
              v -> v.getQualifiedName().equals("io.github.martinwitt.spoon_analyzer.BadSmell"))) {
        try {
          Class<BadSmell> clazz = (Class<BadSmell>) type.getActualClass();
          BadSmell instance = Instancio.create(clazz);
          String name = instance.getName();
          String description = instance.getDescription();
          sb.append("| ");
          sb.append(name);
          sb.append(" | ");
          sb.append(description);
          sb.append(" | ").append(System.lineSeparator());
        } catch (IllegalArgumentException | SecurityException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
        Files.writeString(Path.of("../doc/BadSmells.md"), sb.toString());
      }
      ;
    }
  }
}
