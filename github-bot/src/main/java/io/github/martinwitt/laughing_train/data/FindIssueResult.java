package io.github.martinwitt.laughing_train.data;

import java.io.Serializable;
import java.util.List;

public sealed interface FindIssueResult extends Serializable {

    record SingleResult(Issue issue) implements FindIssueResult {}

    record MultipleResults(List<Issue> issues) implements FindIssueResult {}

    record NoResult() implements FindIssueResult {}
}
