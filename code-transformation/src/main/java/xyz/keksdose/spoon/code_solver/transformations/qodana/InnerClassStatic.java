
package xyz.keksdose.spoon.code_solver.transformations.qodana;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import spoon.reflect.code.CtConstructorCall;
import spoon.reflect.code.CtFieldAccess;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.code.CtThisAccess;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.ModifierKind;
import spoon.reflect.visitor.filter.TypeFilter;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.history.MarkdownString;
import xyz.keksdose.spoon.code_solver.transformations.BadSmell;
import xyz.keksdose.spoon.code_solver.transformations.TransformationProcessor;
import xyz.keksdose.spoon.code_solver.util.Nullsafe;

public class InnerClassStatic extends TransformationProcessor<CtClass<?>> {

	private static final BadSmell STATIC_INNER_CLASS = new BadSmell() {

		@Override
		public MarkdownString getDescription() {
			return MarkdownString.fromRaw("Inner classes should be static if possible");
		}

		@Override
		public MarkdownString getName() {
			return MarkdownString.fromRaw("Static inner class");
		}

	};
	public InnerClassStatic(ChangeListener listener) {
		super(listener);
	}

	@Override
	public void process(CtClass<?> clazz) {
		if (clazz.isTopLevel() || clazz.isStatic() || clazz.isAnonymous() || clazz.isLocalType()) {
			return;
		}
		Set<CtType<?>> innerClasses = getNestedClasses(clazz);
		if (usesNonStaticOuterMethod(clazz, innerClasses) || usesNonStaticOuterField(clazz, innerClasses)
				|| usesNonStaticOuterConstructors(clazz, innerClasses)) {
			return;
		}
		for (CtThisAccess<?> thisAccess : clazz.getElements(new TypeFilter<>(CtThisAccess.class))) {
			if (innerClasses.contains(thisAccess.getType().getTypeDeclaration())) {
				return;
			}
		}
		clazz.addModifier(ModifierKind.STATIC);
		notifyChangeListener(clazz);
	}

	private void notifyChangeListener(CtClass<?> clazz) {
		String message = "Added static modifier to inner class " + clazz.getQualifiedName();
		String markdown = "Added static modifier to inner class `" + clazz.getQualifiedName() + "`";
		setChanged(clazz.getTopLevelType(),
			new Change(STATIC_INNER_CLASS, MarkdownString.fromMarkdown(message, markdown), clazz.getTopLevelType()));
	}

	private boolean usesNonStaticOuterField(CtClass<?> clazz, Set<CtType<?>> innerClasses) {
		return clazz.getElements(new TypeFilter<>(CtFieldAccess.class))
				.stream()
				.anyMatch(v -> Nullsafe
						.get(() -> innerClasses.contains(v.getVariable().getDeclaringType().getTypeDeclaration())
								&& !v.getVariable().isStatic(),
							false));
	}

	private boolean usesNonStaticOuterMethod(CtClass<?> clazz, Set<CtType<?>> innerClasses) {
		return clazz.getElements(new TypeFilter<>(CtInvocation.class))
				.stream()
				.anyMatch(v -> Nullsafe
						.get(() -> innerClasses.contains(v.getExecutable().getDeclaringType().getTypeDeclaration())
								&& !v.getExecutable().isStatic(),
							false));
	}

	private boolean usesNonStaticOuterConstructors(CtClass<?> clazz, Set<CtType<?>> innerClasses) {
		return clazz.getElements(new TypeFilter<>(CtConstructorCall.class))
				.stream()
				.anyMatch(v -> Nullsafe.get(
					() -> innerClasses.contains(v.getExecutable().getDeclaringType().getTypeDeclaration()), false));
	}

	private Set<CtType<?>> getNestedClasses(CtClass<?> clazz) {
		Set<CtType<?>> innerClasses = new HashSet<>(clazz.getTopLevelType().getNestedTypes());
		innerClasses.remove(clazz);
		innerClasses.add(clazz.getTopLevelType());
		return innerClasses;
	}

	@Override

	public List<BadSmell> getHandledBadSmells() {
		return List.of(STATIC_INNER_CLASS);
	}
}
