package io.github.martinwitt.laughing_train.data;

import java.io.Serializable;
import java.nio.file.Path;

public record Project(String name, String url, Path folder) implements Serializable {}
