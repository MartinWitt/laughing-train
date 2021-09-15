
package xyz.keksdose.spoon.code_solver.spoon;

import java.util.LinkedList;
import java.util.List;
import spoon.experimental.CtUnresolvedImport;
import spoon.processing.AbstractProcessor;
import spoon.reflect.declaration.CtCompilationUnit;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtImport;
import spoon.reflect.declaration.CtImportKind;
import spoon.reflect.reference.CtTypeReference;

public class ImportGrouper extends AbstractProcessor<CtElement> {

	@Override
	public void process(CtElement element) {
		if (element instanceof CtCompilationUnit) {
			CtCompilationUnit compilationUnit = (CtCompilationUnit) element;
			List<CtImport> imports = compilationUnit.getImports();

			LinkedList<CtImport> newImports = new LinkedList<>();
			newImports.add(new NewlineImport());
			for (CtImport ctImport : imports) {
				if (newImports.getLast() != null && !isStaticImport(newImports.getLast()) && isStaticImport(ctImport)) {
					newImports.add(new NewlineImport());
				}
				else if (newImports.getLast() != null && isjavaImport(newImports.getLast())
						&& !isjavaImport(ctImport)) {
					newImports.add(new NewlineImport());
				}
				newImports.add(ctImport);
			}
			compilationUnit.setImports(newImports);
		}
	}

	private boolean isjavaImport(CtImport ctImport) {
		return ctImport.getReference() instanceof CtTypeReference
				&& ((CtTypeReference<?>) ctImport.getReference()).getQualifiedName().startsWith("java");
	}

	private boolean isStaticImport(CtImport ctImport) {
		if (ctImport instanceof CtUnresolvedImport) {
			return ((CtUnresolvedImport) ctImport).isStatic();
		}
		return ctImport.getImportKind() == CtImportKind.METHOD || ctImport.getImportKind() == CtImportKind.FIELD;
	}

}
