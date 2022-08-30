package xyz.keksdose.spoon.code_solver.analyzer.qodana.rules;

import java.nio.file.Path;
import java.util.List;
import spoon.reflect.code.CtReturn;
import spoon.reflect.declaration.CtType;
import spoon.reflect.visitor.filter.TypeFilter;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.AnalyzerResult;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.history.MarkdownString;
import xyz.keksdose.spoon.code_solver.transformations.BadSmell;

public class UnnecessaryReturn extends AbstractRefactoring {

    private static final BadSmell UNNECESSARY_RETURN = new BadSmell() {
        @Override
        public MarkdownString getName() {
            return MarkdownString.fromRaw("Unnecessary Return");
        }

        @Override
        public MarkdownString getDescription() {
            return MarkdownString.fromMarkdown(
                    "return is unnecessary as the last statement in a void method",
                    "`return` is unnecessary as the last statement in a `void` method");
        }
    };

    public UnnecessaryReturn(AnalyzerResult result) {
        super(result);
    }

    @Override
    public void refactor(ChangeListener listener, CtType<?> type) {
        if (type.isAnonymous() || !isSameType(type, Path.of(result.filePath()))) {
            return;
        }
        for (CtReturn<?> returnStatement : type.getElements(new TypeFilter<>(CtReturn.class))) {
            if (returnStatement.getPosition().getSourceStart()
                    == result.position().charOffset()) {
                returnStatement.delete();
                listener.setChanged(
                        type.getTopLevelType(),
                        new Change(
                                UNNECESSARY_RETURN,
                                MarkdownString.fromMarkdown(result.message(), result.messageMarkdown()),
                                type.getTopLevelType()));
            }
        }
    }

    @Override
    public List<BadSmell> getHandledBadSmells() {
        return List.of(UNNECESSARY_RETURN);
    }
}
