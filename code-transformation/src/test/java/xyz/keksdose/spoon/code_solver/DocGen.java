package xyz.keksdose.spoon.code_solver;

import com.contrastsecurity.sarif.Result;
import java.io.File;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import spoon.Launcher;
import spoon.reflect.CtModel;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtType;
import spoon.reflect.visitor.filter.TypeFilter;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.rules.AbstractRefactoring;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.transformations.BadSmell;
import xyz.keksdose.spoon.code_solver.transformations.TransformationProcessor;

public class DocGen {

    @Test
    void generateDoc() throws Throwable {
        Launcher launcher = new Launcher();
        launcher.addInputResource("./src/main/java");
        CtModel model = launcher.buildModel();
        List<CtType<?>> transformations = new ArrayList<>();
        for (CtType<?> type : model.getElements(new TypeFilter<>(CtType.class))) {
            if (type.isSubtypeOf(type.getFactory().Type().createReference(TransformationProcessor.class))
                    && !type.isAbstract()) {
                transformations.add(type);
            }
        }
        StringBuilder sb = new StringBuilder();
        List<BadSmell> badSmells = new ArrayList<>();
        for (CtType<?> type : transformations) {
            List<CtMethod<?>> getHandledBadSmells = type.getMethodsByName("getHandledBadSmells");
            if (getHandledBadSmells.size() == 0) {
                continue;
            }
            CtMethod<?> getHandledBadSmellsMethod =
                    getHandledBadSmells.iterator().next();
            Method md = getHandledBadSmellsMethod.getReference().getActualMethod();
            var foo = type.getActualClass().getDeclaredConstructor(ChangeListener.class);
            var bar = foo.newInstance(new Object[] {null});
            badSmells.addAll((List<BadSmell>) md.invoke(bar));
        }
        badSmells.sort((a, b) -> a.getName().asText().compareTo(b.getName().asText()));
        for (BadSmell badSmell : badSmells) {
            sb.append("## ").append(badSmell.getName().asMarkdown()).append("\n");
            sb.append(badSmell.getDescription().asMarkdown()).append("\n");
            if (!badSmell.getLinks().isEmpty()) {
                sb.append(badSmell.getLinks()).append("\n");
            }
            sb.append("\n");
        }
        File f = new File("../doc/BadSmells.md");
        Files.writeString(f.toPath(), sb.toString());
    }

    @Test
    @Disabled
    void generateDocQodana() throws Throwable {
        Launcher launcher = new Launcher();
        launcher.addInputResource("./src/main/java");
        CtModel model = launcher.buildModel();
        List<CtType<?>> transformations = new ArrayList<>();
        for (CtType<?> type : model.getElements(new TypeFilter<>(CtType.class))) {
            if (type.isSubtypeOf(type.getFactory().Type().createReference(AbstractRefactoring.class))
                    && !type.isAbstract()) {
                transformations.add(type);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("# Qodana Rules\n");
        List<BadSmell> badSmells = new ArrayList<>();
        for (CtType<?> type : transformations) {
            List<CtMethod<?>> getHandledBadSmells = type.getMethodsByName("getHandledBadSmells");
            if (getHandledBadSmells.size() == 0) {
                continue;
            }
            CtMethod<?> getHandledBadSmellsMethod =
                    getHandledBadSmells.iterator().next();
            Method md = getHandledBadSmellsMethod.getReference().getActualMethod();
            var resultObject = type.getActualClass().getDeclaredConstructor(Result.class);
            var refactoring = resultObject.newInstance(new Object[] {null});
            badSmells.addAll((List<BadSmell>) md.invoke(refactoring));
        }
        badSmells.sort((a, b) -> a.getName().asText().compareTo(b.getName().asText()));
        for (BadSmell badSmell : badSmells) {
            sb.append("## ").append(badSmell.getName().asMarkdown()).append("\n");
            sb.append(badSmell.getDescription().asMarkdown()).append("\n");
            if (!badSmell.getLinks().isEmpty()) {
                sb.append(badSmell.getLinks()).append("\n");
            }
            sb.append("\n");
        }
        File f = new File("../doc/QodanaBadSmells.md");
        Files.writeString(f.toPath(), sb.toString());
    }
}
