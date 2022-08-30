package xyz.keksdose.spoon.code_solver;

import java.util.List;
import java.util.function.Function;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.transformations.TransformationProcessor;

public class TransformationHelper {

    static class Builder {
        private String path;
        private String className;
        private List<Function<ChangeListener, TransformationProcessor<?>>> processors;

        public Builder path(String path) {
            this.path = path;
            return this;
        }

        public Builder className(String className) {
            this.className = className;
            return this;
        }

        public Builder processors(List<Function<ChangeListener, TransformationProcessor<?>>> processors) {
            this.processors = processors;
            return this;
        }

        public void apply() {
            new TransformationEngine(processors).applyToGivenPath(path, className);
        }
    }
}
