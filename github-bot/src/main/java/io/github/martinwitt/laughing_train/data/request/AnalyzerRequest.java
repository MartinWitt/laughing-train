package io.github.martinwitt.laughing_train.data.request;

import io.github.martinwitt.laughing_train.data.Project;
import java.io.Serializable;

public sealed interface AnalyzerRequest extends Serializable {

    record WithProject(Project project) implements AnalyzerRequest {}
}
