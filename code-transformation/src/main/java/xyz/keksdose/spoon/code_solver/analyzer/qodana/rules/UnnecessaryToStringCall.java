
package xyz.keksdose.spoon.code_solver.analyzer.qodana.rules;

import java.nio.file.Path;
import java.util.List;

import com.contrastsecurity.sarif.Result;

import spoon.reflect.code.CtInvocation;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtType;
import spoon.reflect.visitor.filter.InvocationFilter;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.history.MarkdownString;
import xyz.keksdose.spoon.code_solver.transformations.BadSmell;

public class UnnecessaryToStringCall extends AbstractRefactoring {

	private static final BadSmell UNNECESSARY_TO_STRING_CALL = new BadSmell() {
		@Override
		public MarkdownString getName() {
			return MarkdownString.fromRaw("UnnecessaryToStringCall");
		}

		@Override
		public MarkdownString getDescription() {
			return MarkdownString.fromMarkdown(
				"The toString() method is not needed in cases the underlying method handles the conversion.",
				"The `toString()` method is not needed in cases the underlying method handles the conversion.");
		}
	};

	public UnnecessaryToStringCall(Result result) {
		super(result);
	}

	@Override
	public void refactor(ChangeListener listener, CtType<?> type) {
		if (type.isAnonymous() || !isSameType(type,
			Path.of(result.getLocations().get(0).getPhysicalLocation().getArtifactLocation().getUri()))) {
			return;
		}
		CtMethod<?> toStringMethod = type.getFactory()
				.Type()
				.createReference(Object.class)
				.getTypeDeclaration()
				.getAllMethods()
				.stream()
				.filter(method -> method.getSimpleName().equals("toString"))
				.findFirst()
				.orElse(null);
		for (CtInvocation<?> toStringInvocations : type.getElements(new InvocationFilter(toStringMethod))) {
			if (toStringInvocations.getPosition()
					.getSourceStart() == result.getLocations().get(0).getPhysicalLocation().getRegion().getCharOffset()
							- result.getLocations().get(0).getPhysicalLocation().getRegion().getCharLength()) {
				toStringInvocations.replace(toStringInvocations.getTarget());
				toStringInvocations.getParent().replace(toStringInvocations.getParent().clone());
				listener.setChanged(type, new Change(result.getRuleId(), result.getMessage().getText(), type));

			}
		}
	}

	@Override
	public List<BadSmell> getHandledBadSmells() {
		return List.of(UNNECESSARY_TO_STRING_CALL);
	}

}
