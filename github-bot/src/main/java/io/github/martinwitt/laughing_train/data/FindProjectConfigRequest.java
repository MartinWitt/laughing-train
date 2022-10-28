package io.github.martinwitt.laughing_train.data;

import java.io.Serializable;

public sealed interface FindProjectConfigRequest extends Serializable {
    record ByProjectUrl(String projectUrl) implements FindProjectConfigRequest {}
}
