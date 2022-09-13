package io.github.martinwitt.laughing_train.data;

import java.util.List;
import org.kohsuke.github.GHIssue;

public sealed interface FindPrResult {

    record Success(List<GHIssue> pullRequest) implements FindPrResult {}

    record NoPrFound() implements FindPrResult {}

    record Error(String message) implements FindPrResult {}
}
