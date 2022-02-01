
package xyz.keksdose.spoon.code_solver.analyzer.qodana.rules;

import java.nio.file.Path;
import java.util.LinkedHashSet;
import java.util.List;

import com.contrastsecurity.sarif.Result;

import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.ModifierKind;
import spoon.support.reflect.CtExtendedModifier;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.history.MarkdownString;
import xyz.keksdose.spoon.code_solver.transformations.BadSmell;

public class MethodMayBeStatic extends AbstractRefactoring {

	private static final BadSmell METHOD_MAY_BE_STATIC = new BadSmell() {
		@Override
		public MarkdownString getName() {
			return MarkdownString.fromRaw("Method-may-be-static");
		}

		@Override
		public MarkdownString getDescription() {
			return MarkdownString.fromRaw("Method can be static. This increases the performance of the application.");
		}
	};
	public MethodMayBeStatic(Result result) {
		super(result);
	}

	@Override
	public void refactor(ChangeListener listener, CtType<?> type) {
		if (type.isAnonymous() || !isSameType(type,
			Path.of(result.getLocations().get(0).getPhysicalLocation().getArtifactLocation().getUri()))) {
			return;
		}
		for (CtMethod<?> method : type.getMethods()) {
			if (method.getPosition().getSourceStart() == result.getLocations()
					.get(0)
					.getPhysicalLocation()
					.getRegion()
					.getCharOffset()) {
				LinkedHashSet<CtExtendedModifier> modifiers = new LinkedHashSet<>(method.getExtendedModifiers());
				modifiers.add(CtExtendedModifier.explicit(ModifierKind.STATIC));
				method.setExtendedModifiers(modifiers);
				listener.setChanged(type.getTopLevelType(),
					new Change(METHOD_MAY_BE_STATIC,
						MarkdownString.fromMarkdown(result.getMessage().getText(), result.getMessage().getMarkdown()),
						type.getTopLevelType()));

			}
		}
	}

	@Override
	public List<BadSmell> getHandledBadSmells() {
		return List.of();
	}

}
