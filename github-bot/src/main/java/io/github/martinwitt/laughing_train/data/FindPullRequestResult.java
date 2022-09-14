package io.github.martinwitt.laughing_train.data;

import java.io.Serializable;
import java.util.List;

public sealed interface FindPullRequestResult extends Serializable {
    record SingleResult(PullRequest pullRequest) implements FindPullRequestResult {}

    record MultipleResults(List<PullRequest> pullRequests) implements FindPullRequestResult {}

    record NoResult() implements FindPullRequestResult {}
}
