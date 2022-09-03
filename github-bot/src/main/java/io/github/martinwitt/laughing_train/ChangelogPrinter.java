package io.github.martinwitt.laughing_train;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.AnalyzerResult;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.QodanaRules;
import xyz.keksdose.spoon.code_solver.history.Change;

@ApplicationScoped
public class ChangelogPrinter {

    @Inject
    MarkdownPrinter markdownPrinter;

    @Inject
    Config config;

    String printChangeLog(List<Change> changes) {
        StringBuilder sb = new StringBuilder();
        sb.append("## Changes: \n");
        for (var fix : changes) {
            sb.append("* " + fix.getChangeText().asMarkdown()).append("\n");
        }
        return sb.toString();
    }

    String printRepairedIssues(Collection<Change> changes) {
        StringBuilder sb = new StringBuilder();
        sb.append("# Repairing Code Style Issues\n");
        changes.stream().map(Change::getBadSmell).distinct().forEach(v -> sb.append(
                        "## " + v.getName().asText() + "\n")
                .append(v.getDescription().asMarkdown())
                .append("\n"));
        return sb.toString();
    }

    public String printResults(List<AnalyzerResult> results) {
        Set<String> ruleIds =
                config.getActiveRules().stream().map(QodanaRules::getRuleId).collect(Collectors.toSet());
        List<AnalyzerResult> activeRuleResults =
                results.stream().filter(v -> ruleIds.contains(v.ruleID())).collect(Collectors.toList());
        StringBuilder sb = new StringBuilder();
        sb.append("# Bad smells\n");
        sb.append(String.format("I found %s bad smells:", activeRuleResults.size()))
                .append("\n");
        for (AnalyzerResult result : activeRuleResults) {

            sb.append("## " + result.ruleID())
                    .append("\n")
                    .append(result.messageMarkdown())
                    .append("\n")
                    .append("in ")
                    .append(markdownPrinter.toMarkdown(result.filePath()))
                    .append("\n")
                    .append("### Snippet")
                    .append("\n")
                    .append(markdownPrinter.toJavaMarkdownBlock(result.snippet()));
        }
        return sb.toString();
    }
}
