package io.github.martinwitt.laughing_train.data;

import java.io.Serializable;

public sealed interface FindIssueRequest extends Serializable {

    record WithUserName(String userName) implements FindIssueRequest {}

    record WithUserNameAndRepoAndTitle(String userName, String repo, String title) implements FindIssueRequest {}
}
