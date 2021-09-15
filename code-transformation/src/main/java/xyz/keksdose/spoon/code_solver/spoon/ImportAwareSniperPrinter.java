
package xyz.keksdose.spoon.code_solver.spoon;

import spoon.compiler.Environment;
import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtLambda;
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
			if (!s.endsWith("\n") || !s.endsWith("\r\n")) {
				getPrinterTokenWriter().writeln();
			}
			return;
		}
		super.visitCtImport(ctImport);
	}

	@Override
	public <T> void visitCtLambda(CtLambda<T> lambda) {
		enterCtExpression(lambda);
		getElementPrinterHelper().printList(lambda.getParameters(), null, false, "(", false, false, ",", false, false,
			")", parameter -> scan(parameter));
		getPrinterTokenWriter().writeSpace();
		getPrinterTokenWriter().writeSeparator("->");
		getPrinterTokenWriter().writeSpace();

		if (lambda.getBody() != null) {
			scan(lambda.getBody());
		}
		else {
			scan(lambda.getExpression());
		}
		exitCtExpression(lambda);
	}

	@Override
	public <R> void visitCtBlock(CtBlock<R> block) {
		// TODO Auto-generated method stub
		super.visitCtBlock(block);
	}

}
