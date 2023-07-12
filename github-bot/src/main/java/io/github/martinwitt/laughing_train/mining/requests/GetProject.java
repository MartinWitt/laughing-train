package io.github.martinwitt.laughing_train.mining.requests;

import java.io.Serializable;

public record GetProject(String analyzerName) implements Serializable {}
