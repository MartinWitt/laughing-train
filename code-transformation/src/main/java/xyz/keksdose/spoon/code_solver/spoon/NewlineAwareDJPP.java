
package xyz.keksdose.spoon.code_solver.spoon;

import spoon.compiler.Environment;
import spoon.reflect.declaration.CtImport;
import spoon.reflect.visitor.DefaultJavaPrettyPrinter;
import spoon.reflect.visitor.DefaultTokenWriter;
import spoon.reflect.visitor.PrinterHelper;

public class NewlineAwareDJPP extends DefaultJavaPrettyPrinter {

	public NewlineAwareDJPP(Environment env) {
		super(env);
		ignoreImplicit = false;
		setPrinterTokenWriter(new DefaultTokenWriter(new PrinterHelper(env)));
	}

	@Override
	public void visitCtImport(CtImport ctImport) {
		if (ctImport instanceof NewlineImport) {
			this.getPrinterTokenWriter().writeln();
		}
		else {
			super.visitCtImport(ctImport);
		}
	}
}
