package xyz.keksdose.spoon.code_solver.analyzer.qodana.rules;

import com.google.common.flogger.FluentLogger;
import java.nio.file.Path;
import java.util.List;
import org.apache.commons.lang3.reflect.FieldUtils;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtParameter;
import spoon.reflect.declaration.CtType;
import spoon.reflect.reference.CtParameterReference;
import spoon.reflect.visitor.filter.TypeFilter;
import xyz.keksdose.spoon.code_solver.api.analyzer.AnalyzerResult;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.history.MarkdownString;
import xyz.keksdose.spoon.code_solver.transformations.BadSmell;

public class ParameterNameDiffersFromOverriddenParameter extends AbstractRefactoring {

    private static final FluentLogger logger = FluentLogger.forEnclosingClass();
    private static final BadSmell PARAMETER_NAME_DIFFERS_FROM_OVERRIDDEN_PARAMETER = new BadSmell() {
        @Override
        public MarkdownString getName() {
            return MarkdownString.fromRaw("ParameterNameDiffersFromOverriddenParameter");
        }

        @Override
        public MarkdownString getDescription() {
            return MarkdownString.fromRaw("The parameter name differs from the overridden parameter.");
        }
    };

    public ParameterNameDiffersFromOverriddenParameter(AnalyzerResult result) {
        super(result);
    }

    @Override
    public void refactor(ChangeListener listener, CtType<?> type) {
        if (type.isAnonymous() || !isSameType(type, Path.of(result.filePath()))) {
            return;
        }
        for (CtMethod<?> ctMethod : type.getMethods()) {
            for (CtParameter<?> parameter : ctMethod.getParameters()) {
                String currentName = result.messageMarkdown().split("'")[1];
                String newName = result.messageMarkdown().split("'")[3];
                if (hasMatchingPosition(parameter)
                        && hasOldName(parameter, currentName)
                        && isNotChanged(parameter, newName)) {
                    ctMethod.getElements(new TypeFilter<>(CtParameterReference.class)).stream()
                            .filter(v -> v.getDeclaration() != null)
                            .filter(v -> v.getDeclaration().equals(parameter))
                            .forEach(v -> v.setSimpleName(newName));
                    parameter.setSimpleName(newName);
                    listener.setChanged(
                            type.getTopLevelType(),
                            new Change(
                                    PARAMETER_NAME_DIFFERS_FROM_OVERRIDDEN_PARAMETER,
                                    MarkdownString.fromMarkdown(result.message(), result.messageMarkdown()),
                                    type.getTopLevelType(),
                                    result));
                }
            }
        }
    }

    private boolean hasMatchingPosition(CtParameter<?> parameter) {
        return getSourceStart(parameter) == result.position().charOffset();
    }

    private boolean hasOldName(CtParameter<?> parameter, String currentName) {
        return parameter.getSimpleName().equals(currentName);
    }

    private boolean isNotChanged(CtParameter<?> parameter, String newName) {
        return !hasOldName(parameter, newName);
    }

    @Override
    public List<BadSmell> getHandledBadSmells() {
        return List.of(PARAMETER_NAME_DIFFERS_FROM_OVERRIDDEN_PARAMETER);
    }

    private int getSourceStart(CtParameter<?> parameter) {
        try {
            return (int) FieldUtils.readField(parameter.getPosition(), "sourceStart", true);
        } catch (Throwable e) {
            logger.atSevere().withCause(e).log("Error while getting source start");
            return -1;
        }
    }
}
