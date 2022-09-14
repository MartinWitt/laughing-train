package io.github.martinwitt.laughing_train.data;

import java.util.List;

public sealed interface FindPrResult {

    record Success(List<PullRequest> pullRequest) implements FindPrResult {}

    record NoPrFound() implements FindPrResult {}

    record Error(String message) implements FindPrResult {}
}
