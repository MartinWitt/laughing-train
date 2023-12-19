package io.github.martinwitt.laughing_train.data.request;

import io.github.martinwitt.laughing_train.gitprojects.GitProject;
import java.io.Serializable;

public sealed interface AnalyzerRequest extends Serializable {

  record WithProject(GitProject gitProject) implements AnalyzerRequest {}
}
