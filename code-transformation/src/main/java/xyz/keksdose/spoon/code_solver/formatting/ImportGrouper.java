
package xyz.keksdose.spoon.code_solver.formatting;

import spoon.processing.AbstractProcessor;
import spoon.reflect.declaration.CtCompilationUnit;
import spoon.reflect.declaration.CtElement;

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
