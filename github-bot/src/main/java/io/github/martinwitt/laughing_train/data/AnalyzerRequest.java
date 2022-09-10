package io.github.martinwitt.laughing_train.data;

import java.io.Serializable;
import java.nio.file.Path;

public sealed interface AnalyzerRequest extends Serializable {

    @Deprecated
    record WithFolder(String gitUrl, Path folder) implements AnalyzerRequest {}

    @Deprecated
    record UrlOnly(String gitUrl) implements AnalyzerRequest {}

    record WithProject(Project project) implements AnalyzerRequest {}
}
