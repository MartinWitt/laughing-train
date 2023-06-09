package xyz.keksdose.spoon.code_solver.analyzer.spoon;

import com.google.common.flogger.FluentLogger;
import java.io.InputStream;
import spoon.Launcher;
import spoon.reflect.declaration.CtType;
import spoon.support.compiler.VirtualFile;

public class TemplateHelper {
    private static final FluentLogger logger = FluentLogger.forEnclosingClass();

    private TemplateHelper() {}

    public static CtType<?> fromResource(String resource) {
        ClassLoader classLoader = TemplateHelper.class.getClassLoader();
        try (InputStream inputStream = classLoader.getResourceAsStream(resource); ) {
            byte[] content = inputStream.readAllBytes();
            String contentString = new String(content);
            Launcher launcher = new Launcher();
            VirtualFile file = new VirtualFile(contentString, "Test");
            launcher.addInputResource(file);
            var model = launcher.buildModel();
            return model.getAllTypes().iterator().next();
        } catch (Exception e) {
            logger.atSevere().withCause(e).log("Error while loading resource %s", resource);
            throw new RuntimeException(e);
        }
    }
}
