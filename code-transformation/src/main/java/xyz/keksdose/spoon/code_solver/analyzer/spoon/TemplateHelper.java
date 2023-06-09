package xyz.keksdose.spoon.code_solver.analyzer.spoon;

import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import spoon.Launcher;
import spoon.reflect.declaration.CtType;
import spoon.support.compiler.VirtualFile;

public class TemplateHelper {

    private TemplateHelper() {}

    public static CtType<?> fromResource(String resource) {
        ClassLoader classLoader = TemplateHelper.class.getClassLoader();
        URL resourceUrl = classLoader.getResource(resource);
        if (resourceUrl == null) {
            throw new IllegalArgumentException("Resource not found: " + resource);
        }
        try {
            String content = Files.readString(Path.of(resourceUrl.toURI()));
            Launcher launcher = new Launcher();
            VirtualFile file = new VirtualFile(content, "Test");
            launcher.addInputResource(file);
            var model = launcher.buildModel();
            return model.getAllTypes().iterator().next();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
