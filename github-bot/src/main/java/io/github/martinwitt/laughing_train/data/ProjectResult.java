package io.github.martinwitt.laughing_train.data;

public sealed interface ProjectResult {

    record Success(Project project) implements ProjectResult {}

    record Error(String message) implements ProjectResult {}
}
