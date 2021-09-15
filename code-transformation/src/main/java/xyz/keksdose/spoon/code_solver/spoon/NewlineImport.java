
package xyz.keksdose.spoon.code_solver.spoon;

import spoon.reflect.declaration.CtImportKind;
import spoon.support.reflect.declaration.CtImportImpl;

public class NewlineImport extends CtImportImpl {

	@Override
	public CtImportKind getImportKind() {
		return CtImportKind.UNRESOLVED;
	}
}
