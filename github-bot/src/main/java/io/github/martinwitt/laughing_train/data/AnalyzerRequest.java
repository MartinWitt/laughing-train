package io.github.martinwitt.laughing_train.data;

import java.io.Serializable;

public sealed interface AnalyzerRequest extends Serializable {

    record WithProject(Project project) implements AnalyzerRequest {}
}
