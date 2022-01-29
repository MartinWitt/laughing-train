
package xyz.keksdose.spoon.code_solver.analyzer.qodana.rules;

import java.nio.file.Path;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.contrastsecurity.sarif.Result;

import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtConstructor;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.ModifierKind;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.CtExtendedModifier;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.history.MarkdownString;
import xyz.keksdose.spoon.code_solver.transformations.BadSmell;

public class NonProtectedConstructorInAbstractClass extends AbstractRefactoring {

	private static final BadSmell NON_PROTECTED_CONSTRUCTOR_IN_ABSTRACT_CLASS = new BadSmell() {
		@Override
		public MarkdownString getName() {
			return MarkdownString.fromRaw("Non-Protected-Constructor-in-Abstract-Class");
		}

		@Override
		public MarkdownString getDescription() {
			return MarkdownString.fromRaw(
				"A non-protected constructor in an abstract class is not needed, because only subclasses can be instantiated");
		}
	};
	public NonProtectedConstructorInAbstractClass(Result result) {
		super(result);
	}

	@Override
	public void refactor(ChangeListener listener, CtType<?> type) {
		if (type.isAnonymous() || !isSameType(type,
			Path.of(result.getLocations().get(0).getPhysicalLocation().getArtifactLocation().getUri()))) {
			return;
		}
		// here we know any constructor has the bad smell. Removing public modifier is allowed
		for (CtConstructor<?> constructor : type.getElements(new TypeFilter<>(CtConstructor.class))) {
			if (constructor.getModifiers().contains(ModifierKind.PUBLIC)) {
				Set<CtExtendedModifier> modifiers = new HashSet<>(constructor.getExtendedModifiers());
				modifiers.removeIf(v -> v.getKind() == ModifierKind.PUBLIC);
				modifiers.add(CtExtendedModifier.explicit(ModifierKind.PROTECTED));
				constructor.setExtendedModifiers(modifiers);
				SourcePosition position = constructor.getPosition();
				constructor.setPosition(SourcePosition.NOPOSITION);
				constructor.setPosition(position);
				listener.setChanged(type, new Change(result.getRuleId(), result.getMessage().getText(), type));
			}
		}
	}

	@Override
	public List<BadSmell> getHandledBadSmells() {
		return List.of(NON_PROTECTED_CONSTRUCTOR_IN_ABSTRACT_CLASS);
	}

}
