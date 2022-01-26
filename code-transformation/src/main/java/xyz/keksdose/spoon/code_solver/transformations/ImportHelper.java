
package xyz.keksdose.spoon.code_solver.transformations;

import java.util.ArrayList;
import java.util.List;

import spoon.experimental.CtUnresolvedImport;
import spoon.reflect.declaration.CtCompilationUnit;
import spoon.reflect.declaration.CtImport;
import spoon.reflect.reference.CtExecutableReference;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.CtAbstractImportVisitor;

public class ImportHelper {

	public static void addImport(CtImport ctImport, CtCompilationUnit uni) {
		List<CtImport> imports = uni.getImports();
		if (!imports.contains(ctImport)) {
			imports.add(ctImport);
		}
	}

	public static void addImport(String importString, boolean isStatic, CtCompilationUnit unit) {
		List<CtImport> imports = unit.getImports();
		if (!hasImport(importString, unit)) {
			imports.add(createImport(importString, isStatic, unit));
		}
	}

	public static void removeImport(String importString, boolean isStatic, CtCompilationUnit unit) {
		List<CtImport> imports = new ArrayList<>(unit.getImports());
		List<CtImport> removalableImports = new ArrayList<>();
		for (CtImport ctImport : imports) {
			if (ctImport.getReference() instanceof CtTypeReference) {
				CtTypeReference<?> typeReference = (CtTypeReference<?>) ctImport.getReference();
				if (typeReference.getQualifiedName().equals(importString)) {
					removalableImports.add(ctImport);
				}
			}
			if (ctImport.getReference() instanceof CtExecutableReference) {
				CtExecutableReference<?> executableReference = (CtExecutableReference<?>) ctImport.getReference();
				String simpleName = importString.substring(importString.lastIndexOf('.') + 1);
				if (executableReference.getSimpleName().equals(simpleName)) {
					removalableImports.add(ctImport);
				}
			}
		}
		removalableImports.forEach(imports::remove);
		removalableImports.forEach(CtImport::delete);
		ImportVisitor visitor = new ImportVisitor(importString);
		imports.forEach(i -> i.accept(visitor));
		imports.remove(visitor.getResult());
		imports.remove(createImport(importString, isStatic, unit));
		unit.setImports(imports);
	}

	private static CtImport createImport(String importString, boolean isStatic, CtCompilationUnit unit) {
		return unit.getFactory().createUnresolvedImport(importString, isStatic);
	}

	private static boolean hasImport(String importString, CtCompilationUnit unit) {
		ImportVisitor visitor = new ImportVisitor(importString);
		unit.getImports().forEach(v -> v.accept(visitor));
		if (visitor.getResult() != null) {
			return true;
		}
		return unit.getImports()
				.stream()
				.filter(v -> v.getReference() != null)
				.anyMatch(v -> importString.substring(importString.lastIndexOf('.') + 1)
						.equals(v.getReference().getSimpleName()));
	}

	private static class ImportVisitor extends CtAbstractImportVisitor {

		public ImportVisitor(String importString) {
			this.importString = importString;
		}

		private String importString;
		private CtImport result;

		// all junit imports are unresolved imports
		@Override
		public <T> void visitUnresolvedImport(CtUnresolvedImport unresolvedImport) {
			if (unresolvedImport.getUnresolvedReference().equals(importString)) {
				result = unresolvedImport;
			}
		}

		public CtImport getResult() {
			return result;
		}
	}
}
