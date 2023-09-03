package xyz.keksdose.spoon.code_solver.analyzer.qodana.rules;

import io.github.martinwitt.laughing_train.domain.entity.AnalyzerResult;
import java.nio.file.Path;
import java.util.List;
import spoon.reflect.code.CtNewArray;
import spoon.reflect.declaration.CtType;
import xyz.keksdose.spoon.code_solver.analyzer.AbstractRefactoring;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.history.MarkdownString;
import xyz.keksdose.spoon.code_solver.transformations.BadSmell;

public class RedundantArrayCreation extends AbstractRefactoring {

    private static final BadSmell BAD_SMELL = new BadSmell() {

        @Override
        public MarkdownString getDescription() {
            String description =
                    "Creating a empty array for calling varargs methods is redundant. You can call the method directly without the array. The fix is to remove the empty array.";
            return MarkdownString.fromRaw(description);
        }

        @Override
        public MarkdownString getName() {
            return MarkdownString.fromRaw("RedundantArrayCreation");
        }
    };

    public RedundantArrayCreation(AnalyzerResult result) {
        super(result);
    }

    @Override
    public void refactor(ChangeListener listener, CtType<?> type) {
        if (type.isAnonymous() || !isSameType(type, Path.of(result.filePath()))) {
            return;
        }
        List<CtNewArray<?>> arrayReads = type.getElements(CtNewArray.class::isInstance);
        for (CtNewArray<?> arrayRead : arrayReads) {
            var sourcePosition = arrayRead.getPosition();
            if (sourcePosition.getSourceStart() == result.position().charOffset()) {
                String text = "Removed empty array creation %s for calling varargs method.";
                MarkdownString description =
                        MarkdownString.fromMarkdown(text.formatted(arrayRead), text.formatted("`" + arrayRead + "`"));
                Change change = new Change(BAD_SMELL, description, type, result);
                listener.setChanged(type, change);
                arrayRead.delete();
            }
        }
    }

    @Override
    public List<BadSmell> getHandledBadSmells() {
        return List.of(BAD_SMELL);
    }
}
