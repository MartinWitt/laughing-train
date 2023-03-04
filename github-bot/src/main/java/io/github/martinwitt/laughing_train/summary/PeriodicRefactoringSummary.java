package io.github.martinwitt.laughing_train.summary;

import io.github.martinwitt.laughing_train.domain.entity.Project;
import io.github.martinwitt.laughing_train.domain.value.RuleId;
import io.github.martinwitt.laughing_train.persistence.BadSmell;
import io.github.martinwitt.laughing_train.persistence.repository.BadSmellRepository;
import io.github.martinwitt.laughing_train.persistence.repository.ProjectRepository;
import io.quarkus.scheduler.Scheduled;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import javax.inject.Inject;
import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHIssueState;
import org.kohsuke.github.GitHub;
import xyz.keksdose.spoon.code_solver.analyzer.AnalyzerRule;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.QodanaRules;

public class PeriodicRefactoringSummary {

    private static final String LABEL_NAME = "laughing-train-refactoring-summary";

    @Inject
    ProjectRepository projectRepository;

    @Inject
    BadSmellRepository badSmellRepository;

    @Scheduled(every = "2h", delay = 10)
    void createSummary() throws IOException {
        var issue = searchSummaryIssueOnGithub().get(0);
        issue.setBody(createSummaryBody());
    }

    private String createSummaryBody() {
        Set<String> ruleIDs = getNameOfAllRules();
        StringBuilder summary = new StringBuilder();
        summary.append("# Summary of all refactoring opportunities:\n");
        for (Project project : projectRepository.getAll()) {
            String commitHash = getNewestHash(project);
            Map<RuleId, List<BadSmell>> badSmellByRuleId = getFixableBadSmells(ruleIDs, commitHash);
            if (badSmellByRuleId.values().stream().allMatch(List::isEmpty)) {
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

    private Map<RuleId, List<BadSmell>> getFixableBadSmells(Set<String> ruleIDs, String commitHash) {
        return badSmellRepository.findByCommitHash(commitHash).stream()
                .filter(v -> ruleIDs.contains(v.ruleID().id()))
                .collect(Collectors.groupingBy(BadSmell::ruleID));
    }

    private String getNewestHash(Project project) {
        return project.getCommitHashes().get(project.getCommitHashes().size() - 1);
    }

    private Set<String> getNameOfAllRules() {
        return getAllRules().stream().map(v -> v.getRuleId().id()).collect(Collectors.toSet());
    }

    private List<AnalyzerRule> getAllRules() {
        return Arrays.asList(QodanaRules.values());
    }

    private List<GHIssue> searchSummaryIssueOnGithub() throws IOException {
        return GitHub.connectUsingOAuth(System.getenv("GITHUB_TOKEN"))
                .getRepository("MartinWitt/laughing-train")
                .queryIssues()
                .pageSize(1)
                .label(LABEL_NAME)
                .state(GHIssueState.OPEN)
                .list()
                .toList();
    }
}
