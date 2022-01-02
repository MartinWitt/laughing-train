
package xyz.keksdose.spoon.code_solver.spoon;

import spoon.compiler.Environment;
import spoon.reflect.declaration.CtCompilationUnit;
import spoon.reflect.declaration.CtImport;
import spoon.support.sniper.SniperJavaPrettyPrinter;
import spoon.support.util.ModelList;

public class ImportAwareSniperPrinter extends SniperJavaPrettyPrinter {

	public ImportAwareSniperPrinter(Environment env) {
		super(env);
	}

	@Override
	protected ModelList<CtImport> getImports(CtCompilationUnit compilationUnit) {
		return compilationUnit.getImports();
	}

	@Override
	public void visitCtImport(CtImport ctImport) {
		if (ctImport instanceof NewlineImport) {
			String s = getPrinterTokenWriter().getPrinterHelper().toString();
			if (!endsWithNewline(s)) {
				getPrinterTokenWriter().writeln();
			}
			return;
		}
		super.visitCtImport(ctImport);
	}

	private boolean endsWithNewline(String s) {
		return s.endsWith("\n") || s.endsWith("\r\n");
	}
}
