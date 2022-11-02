package xyz.keksdose.spoon.code_solver.regressionTests;

import static org.junit.jupiter.api.Assertions.assertFalse;

import io.github.martinwitt.laughing_train.api.RuleId;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import org.junit.jupiter.api.Test;
import spoon.reflect.declaration.CtType;
import xyz.keksdose.spoon.code_solver.TransformationEngine;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.QodanaAnalyzerResult;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.rules.ProtectedMemberInFinalClass;
import xyz.keksdose.spoon.code_solver.api.analyzer.Position;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.transformations.TransformationProcessor;

public class ProtectedMemberInFinalClassTest {

    @Test
    void rxJavaFlowableGroupBy() throws IOException {
        Position position = new Position(334, 0, 9, 0, 12198, 9);
        String filePath =
                "./src/test/resources/regression/protectedMemberInFinalClass/rxJava/FlowableGroupBy/FlowableGroupBy.java";
        File file = File.createTempFile("FlowableGroupBy", ".java");
        Files.writeString(file.toPath(), Files.readString(Path.of(filePath)));
        QodanaAnalyzerResult result = new QodanaAnalyzerResult(
                new RuleId("ProtectedMemberInFinalClass"),
                file.getName(),
                position,
                "Class member declared 'protected' in 'final' class",
                "",
                "qodana");
        ChangeListener listener = new ChangeListener();

        TransformationEngine engine = new TransformationEngine(List.of(v -> new TransformationProcessor<CtType<?>>(v) {
            @Override
            public void process(CtType<?> arg0) {
                new ProtectedMemberInFinalClass(result).refactor(listener, arg0);
            }
        }));
        engine.setChangeListener(listener);
        engine.applyToGivenPath(file.toPath().toString());
        assertFalse(Files.readString(file.toPath()).contains("@Overridevoid"));
    }
}
