
package xyz.keksdose.spoon.code_solver.formatting;

import java.util.LinkedList;
import java.util.List;

import spoon.reflect.declaration.CtImport;

public class SpoonStyle implements ImportGrouping {

	@Override
	public List<CtImport> group(List<CtImport> imports) {
		LinkedList<CtImport> staticImports = new LinkedList<>();
		LinkedList<CtImport> nonStaticImports = new LinkedList<>();
		LinkedList<CtImport> javaImports = new LinkedList<>();
		for (CtImport ctImport : imports) {
			if (isStaticImport(ctImport)) {
				staticImports.add(ctImport);
			}
			else if (isjavaImport(ctImport)) {
				javaImports.add(ctImport);
			}
			else {
				nonStaticImports.add(ctImport);
			}
		}
		LinkedList<CtImport> newImports = new LinkedList<>();
		newImports.addAll(nonStaticImports);
		newImports.add(getNewLineImport());
		newImports.addAll(javaImports);
		newImports.add(getNewLineImport());
		newImports.addAll(staticImports);
		return newImports;
	}
}
