package io.github.martinwitt.laughing_train.mining.requests;

import io.github.martinwitt.laughing_train.data.result.CodeAnalyzerResult;
import io.github.martinwitt.laughing_train.gitprojects.GitProject;
import java.io.Serializable;

public record StoreResults(GitProject gitProject, CodeAnalyzerResult result, String analyzerName)
    implements Serializable {}
