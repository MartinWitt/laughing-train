package io.github.martinwitt.laughing_train;

import java.io.IOException;
import java.util.List;
import org.kohsuke.github.GHEventPayload;
import org.kohsuke.github.GHEventPayload.Issue;
import org.kohsuke.github.GHEventPayload.IssueComment;
import org.kohsuke.github.GHIssueState;
import org.kohsuke.github.GHPullRequest;
import org.kohsuke.github.GHRepository;

public final class GitHubUtils {

    private GitHubUtils() {}

    public static List<GHPullRequest> getOpenPullRequests(GHEventPayload.IssueComment issueComment) throws IOException {
        return issueComment.getRepository().getPullRequests(GHIssueState.OPEN);
    }

    public static boolean isClosed(GHEventPayload.Issue issueComment) {
        return issueComment.getIssue().getState() != GHIssueState.OPEN;
    }

    public static String getLogin(IssueComment issueComment) {
        try {
            return issueComment.getComment().getUser().getLogin();
        } catch (IOException e) {
            return "";
        }
    }

    public static String getLogin(Issue issueComment) {

        return issueComment.getSender().getLogin();
    }

    public static void createLabelIfMissing(GHRepository repo) throws IOException {
        try {
            repo.getLabel(Constants.LABEL_NAME);
        } catch (Exception e) {
            repo.createLabel(Constants.LABEL_NAME, "8ef76c");
        }
    }

    public static String getTransportUrl(GHRepository repo) {
        return repo.getHttpTransportUrl();
    }

    public static String getTransportUrl(IssueComment issue) {
        return issue.getRepository().getHttpTransportUrl();
    }
}
