package io.github.martinwitt.laughing_train.data;

import java.nio.file.Path;

public sealed interface AnalyzerRequest permits AnalyzerRequest.UrlOnly, AnalyzerRequest.WithFolder {

    record WithFolder(String gitUrl, Path folder) implements AnalyzerRequest {}

    record UrlOnly(String gitUrl) implements AnalyzerRequest {}
}
