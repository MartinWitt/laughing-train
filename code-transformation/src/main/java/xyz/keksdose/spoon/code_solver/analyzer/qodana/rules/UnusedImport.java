package xyz.keksdose.spoon.code_solver.analyzer.qodana.rules;

import java.nio.file.Path;
import java.util.List;
import spoon.reflect.declaration.CtImport;
import spoon.reflect.declaration.CtType;
import spoon.support.util.ModelList;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.AnalyzerResult;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.history.MarkdownString;
import xyz.keksdose.spoon.code_solver.transformations.BadSmell;

public class UnusedImport extends AbstractRefactoring {

    private static final BadSmell UNUSED_IMPORT = new BadSmell() {

        @Override
        public MarkdownString getDescription() {
            return MarkdownString.fromRaw("Unused imports have no effect on the code and should be removed.");
        }

        @Override
        public MarkdownString getName() {
            return MarkdownString.fromRaw("UnusedImport");
        }
    };

    public UnusedImport(AnalyzerResult result) {
        super(result);
    }

    @Override
    public void refactor(ChangeListener listener, CtType<?> type) {
        if (type.isAnonymous() || !isSameType(type, Path.of(result.filePath()))) {
            return;
        }
        ModelList<CtImport> imports = type.getPosition().getCompilationUnit().getImports();
        for (CtImport ctImport : imports) {
            if (ctImport.getPosition().getLine() == result.position().startLine()) {
                imports.remove(ctImport);
                listener.setChanged(
                        type.getTopLevelType(),
                        new Change(
                                UNUSED_IMPORT,
                                MarkdownString.fromRaw("The import " + ctImport + " is not used and can be removed."),
                                type.getTopLevelType()));
                break;
            }
        }
    }

    @Override
    public List<BadSmell> getHandledBadSmells() {
        return List.of(UNUSED_IMPORT);
    }
}
