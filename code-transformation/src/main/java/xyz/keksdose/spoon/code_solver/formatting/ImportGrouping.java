
package xyz.keksdose.spoon.code_solver.formatting;

import java.util.List;

import spoon.experimental.CtUnresolvedImport;
import spoon.reflect.declaration.CtImport;
import spoon.reflect.declaration.CtImportKind;
import spoon.reflect.reference.CtTypeReference;
import xyz.keksdose.spoon.code_solver.spoon.NewlineImport;

public interface ImportGrouping {

	List<CtImport> group(List<CtImport> imports);

	default NewlineImport getNewLineImport() {
		return new NewlineImport();
	}

	default boolean isjavaImport(CtImport ctImport) {
		return ctImport.getReference() instanceof CtTypeReference
				&& ((CtTypeReference<?>) ctImport.getReference()).getQualifiedName().startsWith("java");
	}

	default boolean isStaticImport(CtImport ctImport) {
		if (ctImport instanceof CtUnresolvedImport) {
			return ((CtUnresolvedImport) ctImport).isStatic();
		}
		return ctImport.getImportKind() == CtImportKind.METHOD || ctImport.getImportKind() == CtImportKind.FIELD;
	}
}
