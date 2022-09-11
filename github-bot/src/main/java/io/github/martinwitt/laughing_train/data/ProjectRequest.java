package io.github.martinwitt.laughing_train.data;

import java.io.Serializable;

public sealed interface ProjectRequest extends Serializable {

    record WithUrl(String url) implements ProjectRequest {}
}
