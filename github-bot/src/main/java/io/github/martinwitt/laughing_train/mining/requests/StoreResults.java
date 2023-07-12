package io.github.martinwitt.laughing_train.mining.requests;

import io.github.martinwitt.laughing_train.data.Project;
import io.github.martinwitt.laughing_train.data.result.CodeAnalyzerResult;
import java.io.Serializable;

public record StoreResults(Project project, CodeAnalyzerResult result) implements Serializable {}
