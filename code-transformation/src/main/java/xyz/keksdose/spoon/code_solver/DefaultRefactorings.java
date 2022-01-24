
package xyz.keksdose.spoon.code_solver;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.transformations.TransformationProcessor;
import xyz.keksdose.spoon.code_solver.transformations.junit.migration.AssertThatTransformation;
import xyz.keksdose.spoon.code_solver.transformations.junit.migration.AssertionsTransformation;
import xyz.keksdose.spoon.code_solver.transformations.junit.migration.ExpectedExceptionRemoval;
import xyz.keksdose.spoon.code_solver.transformations.junit.migration.Junit4AnnotationsTransformation;
import xyz.keksdose.spoon.code_solver.transformations.junit.migration.TestAnnotation;
import xyz.keksdose.spoon.code_solver.transformations.junit.simplification.TempoaryFolderAsParameter;
import xyz.keksdose.spoon.code_solver.transformations.qodana.CollectionEmptyCheck;
import xyz.keksdose.spoon.code_solver.transformations.qodana.RedundantFieldInitialization;
import xyz.keksdose.spoon.code_solver.transformations.qodana.StaticAccess;
import xyz.keksdose.spoon.code_solver.transformations.self.ProtectedMemberInFinalType;
import xyz.keksdose.spoon.code_solver.transformations.self.StringBuilderDirectUse;
import xyz.keksdose.spoon.code_solver.transformations.self.ThreadLocalWithInitial;

/**
 * This class provides default groups of transformations.
 */
public enum DefaultRefactorings implements Supplier<List<Function<ChangeListener, TransformationProcessor<?>>>> {
	/**
	* This group contains all transformations that are needed to migrate from junit 4 to junit 5.
	*/
	JUNIT4_MIGRATION() {
		@Override
		public List<Function<ChangeListener, TransformationProcessor<?>>> get() {
			return List.of(TempoaryFolderAsParameter::new, Junit4AnnotationsTransformation::new, TestAnnotation::new,
				AssertionsTransformation::new, AssertThatTransformation::new, ExpectedExceptionRemoval::new);
		}
	},
	SIMPLIFICATION() {
		@Override
		public List<Function<ChangeListener, TransformationProcessor<?>>> get() {
			return List.of(CollectionEmptyCheck::new, RedundantFieldInitialization::new, StaticAccess::new,
				StringBuilderDirectUse::new, ThreadLocalWithInitial::new, ProtectedMemberInFinalType::new);
		}
	};

	@Override
	public List<Function<ChangeListener, TransformationProcessor<?>>> get() {
		return List.of();
	}

}
