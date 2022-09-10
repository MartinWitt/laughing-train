package io.github.martinwitt.laughing_train.data;

import java.io.Serializable;

public sealed interface ProjectResult extends Serializable {

    record Success(Project project) implements ProjectResult {}

    record Error(String message) implements ProjectResult {}
}
