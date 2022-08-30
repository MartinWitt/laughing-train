package xyz.keksdose.spoon.code_solver.api;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import xyz.keksdose.spoon.code_solver.TransformationEngine;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.QodanaRefactor;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.history.Changelog;
import xyz.keksdose.spoon.code_solver.printing.IPrinting;

public class Refactoring {

    private RepoCheckout repoCheckout;
    private QodanaRefactor qodanaRefactor;
    private List<AfterRefactorStep> afterRefactorSteps;
    private ChangeListener listener;
    private IPrinting printing;
    private String subProjectSuffix;

    private Refactoring(Refactoring.Builder builder) {
        this.repoCheckout = builder.repoCheckout;
        this.qodanaRefactor = builder.qodanaRefactor;
        this.afterRefactorSteps = builder.afterRefactorStep;
        this.listener = builder.listener;
        this.printing = builder.printing;
        this.subProjectSuffix = builder.subProjectSuffix;
    }

    public void apply() {
        File project = repoCheckout.prepareRepo();
        qodanaRefactor.analyze(project.toPath());
        TransformationEngine transformationEngine = new TransformationEngine(List.of(v -> qodanaRefactor));
        transformationEngine.setPrinting(printing);
        transformationEngine.setChangeListener(listener);
        Changelog changelog = transformationEngine.applyToGivenPath(project.getAbsolutePath() + subProjectSuffix);
        afterRefactorSteps.forEach(v -> v.apply(changelog, project));
    }

    public static class Builder {
        private RepoCheckout repoCheckout;
        private QodanaRefactor qodanaRefactor;
        private List<AfterRefactorStep> afterRefactorStep = new ArrayList<>();
        private ChangeListener listener = new ChangeListener();
        private IPrinting printing = null;
        private String subProjectSuffix = "";

        public Builder(QodanaRefactor qodana, RepoCheckout repoCheckout) {
            this.qodanaRefactor = qodana;
            this.repoCheckout = repoCheckout;
        }

        public Builder withPrinting(IPrinting printing) {
            this.printing = printing;
            return this;
        }

        public Builder withChangeListener(ChangeListener listener) {
            this.listener = listener;
            return this;
        }

        public Builder withAfterRefactorStep(AfterRefactorStep afterRefactorStep) {
            this.afterRefactorStep.add(afterRefactorStep);
            return this;
        }

        public Builder withSubProject(String subProjectSuffix) {
            this.subProjectSuffix = subProjectSuffix;
            return this;
        }

        public Refactoring build() {
            return new Refactoring(this);
        }
    }
}
