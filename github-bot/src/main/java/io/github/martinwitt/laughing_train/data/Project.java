package io.github.martinwitt.laughing_train.data;

import java.io.File;
import java.io.Serializable;

public record Project(String name, String url, File folder) implements Serializable {}
