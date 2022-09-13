package io.github.martinwitt.laughing_train.data;

import java.io.Serializable;
import java.util.List;
import org.kohsuke.github.GHIssue;

public sealed interface FindIssueResult extends Serializable {

    record SingleResult(GHIssue issue) implements FindIssueResult {}

    record MultipleResults(List<GHIssue> issues) implements FindIssueResult {}
}
