
package xyz.keksdose.spoon.code_solver.formatting;

import java.util.LinkedList;
import java.util.List;

import spoon.reflect.declaration.CtImport;
import xyz.keksdose.spoon.code_solver.spoon.NewlineImport;

public class NewLineImportGroups implements ImportGrouping {

	@Override
	public List<CtImport> group(List<CtImport> imports) {
		LinkedList<CtImport> newImports = new LinkedList<>();
		newImports.add(new NewlineImport());
		for (CtImport ctImport : imports) {
			if (newImports.getLast() != null && !isStaticImport(newImports.getLast()) && isStaticImport(ctImport)) {
				newImports.add(getNewLineImport());
			}
			else if (newImports.getLast() != null && isjavaImport(newImports.getLast()) && !isjavaImport(ctImport)) {
				newImports.add(getNewLineImport());
			}
			newImports.add(ctImport);
		}
		return newImports;
	}

}
