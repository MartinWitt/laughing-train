package xyz.keksdose.spoon.code_solver.formatting;

import java.util.List;
import java.util.stream.Collectors;
import spoon.processing.AbstractProcessor;
import spoon.reflect.declaration.CtCompilationUnit;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtImport;

public class ImportGrouper extends AbstractProcessor<CtElement> {

    private ImportGrouping style;

    public ImportGrouper(ImportGrouping style) {
        this.style = style;
    }

    @Override
    public void process(CtElement element) {
        if (element instanceof CtCompilationUnit) {
            CtCompilationUnit compilationUnit = (CtCompilationUnit) element;
            compilationUnit.setImports(cloneImports(compilationUnit));
        }
    }

    private List<CtImport> cloneImports(CtCompilationUnit compilationUnit) {
        return style.group(compilationUnit.getImports()).stream()
                .map(CtImport::clone)
                .collect(Collectors.toList());
    }
}
