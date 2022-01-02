
package xyz.keksdose.spoon.code_solver.formatting;

import java.util.LinkedList;
import java.util.List;
import spoon.experimental.CtUnresolvedImport;
import spoon.processing.AbstractProcessor;
import spoon.reflect.declaration.CtCompilationUnit;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtImport;
import spoon.reflect.declaration.CtImportKind;
import spoon.reflect.reference.CtTypeReference;
import xyz.keksdose.spoon.code_solver.spoon.NewlineImport;

public class ImportGrouper extends AbstractProcessor<CtElement> {

	private ImportGrouping style;

	public ImportGrouper(ImportGrouping style) {
		this.style = style;
	}

	@Override
	public void process(CtElement element) {
		if (element instanceof CtCompilationUnit) {
			CtCompilationUnit compilationUnit = (CtCompilationUnit) element;
			compilationUnit.setImports(style.group(compilationUnit.getImports()));
		}
	}
}
