
package xyz.keksdose.spoon.code_solver;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import spoon.processing.ProcessingManager;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.transformations.TransformationProcessor;

public class TransformationHelper {

	static class Builder {
		private String path;
		private String className;
		private Iterable<Function<ChangeListener, TransformationProcessor<?>>> processors;

		public Builder path(String path) {
			this.path = path;
			return this;
		}

		public Builder className(String className) {
			this.className = className;
			return this;
		}

		public Builder processors(Iterable<Function<ChangeListener, TransformationProcessor<?>>> processors) {
			this.processors = processors;
			return this;
		}

		public void apply() {
			new TestTransformationEngine().applyWithGivenProcessors(path, className, processors);
		}
	}

	private static class TestTransformationEngine extends TransformationEngine {

		private List<Function<ChangeListener, TransformationProcessor<?>>> currentProcessors = new ArrayList<>();

		public void applyWithGivenProcessors(String path, String className,
				Iterable<Function<ChangeListener, TransformationProcessor<?>>> processors) {
			currentProcessors.clear();
			processors.forEach(currentProcessors::add);
			applyToGivenPath(path, className);
		}

		@Override
		protected void addProcessors(ProcessingManager pm, ChangeListener listener) {
			currentProcessors.stream().map(v -> v.apply(listener)).forEach(pm::addProcessor);
		}
	}
}
