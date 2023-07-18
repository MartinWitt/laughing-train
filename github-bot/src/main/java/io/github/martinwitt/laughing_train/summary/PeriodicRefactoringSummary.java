package io.github.martinwitt.laughing_train.summary;

import io.github.martinwitt.laughing_train.domain.entity.RemoteProject;
import io.github.martinwitt.laughing_train.domain.value.RuleId;
import io.github.martinwitt.laughing_train.persistence.BadSmell;
import io.github.martinwitt.laughing_train.persistence.repository.BadSmellRepository;
import io.github.martinwitt.laughing_train.persistence.repository.ProjectRepository;
import io.quarkus.scheduler.Scheduled;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHIssueState;
import org.kohsuke.github.GitHub;

public class PeriodicRefactoringSummary {

    private static final String LABEL_NAME = "laughing-train-refactoring-summary";

    ProjectRepository projectRepository;
    BadSmellRepository badSmellRepository;
    GetFixableBadSmells getFixableBadSmells;

    PeriodicRefactoringSummary(
            ProjectRepository projectRepository,
            BadSmellRepository badSmellRepository,
            GetFixableBadSmells getFixableBadSmells) {
        this.projectRepository = projectRepository;
        this.badSmellRepository = badSmellRepository;
        this.getFixableBadSmells = getFixableBadSmells;
    }

    @Scheduled(every = "2h", delay = 10)
    void createSummary() throws IOException {
        var issue = searchSummaryIssueOnGithub();
        issue.setBody(createSummaryBody());
    }

    private String createSummaryBody() {

        StringBuilder summary = new StringBuilder();
        summary.append("# Summary of all refactoring opportunities:\n");
        for (RemoteProject project : projectRepository.getAll()) {
            List<BadSmell> badSmells = getFixableBadSmells.getFixableBadSmells(project);
            Map<RuleId, List<BadSmell>> badSmellByRuleId =
                    badSmells.stream().collect(Collectors.groupingBy(BadSmell::ruleID));
            if (badSmells.isEmpty()) {
                continue;
            }
            summary.append("## Project: ").append(project.getProjectName()).append("\n");
            summary.append("| Rule | Occurrences |\n");
            summary.append("| --- | --- |\n");
            for (var entry : badSmellByRuleId.entrySet()) {
                if (entry.getValue().isEmpty()) {
                    continue;
                }
                summary.append("| ")
                        .append(entry.getKey().id())
                        .append(" | ")
                        .append(entry.getValue().size())
                        .append(" |\n");
            }
        }
        return summary.toString();
    }

    /**
     * Search for the summary issue on github. The summary issue contains an overview over all refactoring opportunities.
     * @return the summary issue on github never null
     */
    private GHIssue searchSummaryIssueOnGithub() throws IOException {
        var list = GitHub.connectUsingOAuth(System.getenv("GITHUB_TOKEN"))
                .getRepository("MartinWitt/laughing-train")
                .queryIssues()
                .pageSize(1)
                .label(LABEL_NAME)
                .state(GHIssueState.OPEN)
                .list()
                .toList();
        if (list.isEmpty()) {
            throw new IllegalStateException("No summary issue found");
        }
        return list.get(0);
    }
}
