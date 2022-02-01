
package xyz.keksdose.spoon.code_solver.analyzer.qodana.rules;

import java.nio.file.Path;
import java.util.LinkedHashSet;
import java.util.List;

import com.contrastsecurity.sarif.Result;
import com.google.common.flogger.FluentLogger;

import org.apache.commons.lang3.reflect.FieldUtils;

import spoon.reflect.code.CtExecutableReferenceExpression;
import spoon.reflect.code.CtTypeAccess;
import spoon.reflect.declaration.CtExecutable;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.ModifierKind;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.CtExtendedModifier;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.history.MarkdownString;
import xyz.keksdose.spoon.code_solver.transformations.BadSmell;

public class MethodMayBeStatic extends AbstractRefactoring {

	private static final FluentLogger logger = FluentLogger.forEnclosingClass();
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
			if (getSourceStart(method) == getSourceStartOfResult()) {
				if (method.isStatic() && method.isPrivate()) {
					continue;
				}
				List<CtExecutableReferenceExpression<?, CtTypeAccess<?>>> executableRefs = type
						.getElements(new TypeFilter<>(CtExecutableReferenceExpression.class));
				refactorExecutableReferences(method, executableRefs);
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

	private void refactorExecutableReferences(CtMethod<?> method,
			List<CtExecutableReferenceExpression<?, CtTypeAccess<?>>> executableRefs) {
		for (CtExecutableReferenceExpression<?, CtTypeAccess<?>> executableRef : executableRefs) {
			if (executableRef.getExecutable() != null) {
				CtExecutable<?> exec = executableRef.getExecutable().getExecutableDeclaration();
				if (exec instanceof CtMethod) {
					CtMethod<?> methodRef = (CtMethod<?>) exec;
					if (methodRef.equals(method)) {
						CtTypeReference<Object> typeReference = method.getFactory()
								.createSimplyQualifiedReference(method.getDeclaringType().getQualifiedName());
						executableRef.setTarget(method.getFactory().createTypeAccess(typeReference));
					}
				}
			}
		}
	}

	private Integer getSourceStartOfResult() {
		return result.getLocations().get(0).getPhysicalLocation().getRegion().getCharOffset();
	}

	private int getSourceStart(CtMethod<?> method) {
		try {
			return (int) FieldUtils.readField(method.getPosition(), "sourceStart", true);
		}
		catch (Throwable e) {
			logger.atSevere().withCause(e).log("Error while getting source start");
			return -1;
		}
	}

	@Override
	public List<BadSmell> getHandledBadSmells() {
		return List.of(METHOD_MAY_BE_STATIC);
	}

}
