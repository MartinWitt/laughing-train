package io.github.martinwitt.laughing_train.mining;

import io.github.martinwitt.laughing_train.Config;
import io.github.martinwitt.laughing_train.MarkdownPrinter;
import io.github.martinwitt.laughing_train.data.Project;
import io.github.martinwitt.laughing_train.domain.value.RuleId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.QodanaRules;
import xyz.keksdose.spoon.code_solver.api.analyzer.AnalyzerResult;

@ApplicationScoped
public class MiningPrinter {

    @Inject
    MarkdownPrinter markdownPrinter;

    @Inject
    Config config;

    public String printAllResults(List<AnalyzerResult> results, Project project) {
        StringBuilder sb = new StringBuilder();
        List<RuleId> ruleIds = config.getRules().keySet().stream()
                .map(QodanaRules::getRuleId)
                .distinct()
                .sorted(Comparator.comparing(RuleId::ruleID))
                .collect(Collectors.toList());
        long fixableRules =
                results.stream().filter(v -> ruleIds.contains(v.ruleID())).count();
        sb.append("\n# Bad smells\n");
        sb.append(String.format("I found %s bad smells with %s repairable:", results.size(), fixableRules))
                .append("\n");
        sb.append(generateTableBadSmells(results, ruleIds));
        var grouped = results.stream().collect(Collectors.groupingBy(AnalyzerResult::ruleID));
        for (var groupedResult : grouped.entrySet()) {
            sb.append("## ").append(groupedResult.getKey()).append("\n");
            for (AnalyzerResult result : groupedResult.getValue()) {
                sb.append("### ")
                        .append(result.ruleID().ruleID())
                        .append("\n")
                        .append(result.messageMarkdown())
                        .append("\n")
                        .append("in ")
                        .append(markdownPrinter.toMarkdown(result.filePath()))
                        .append("\n")
                        .append("#### Snippet")
                        .append("\n")
                        .append(markdownPrinter.toJavaMarkdownBlock(result.snippet()))
                        .append("\n");
            }
        }
        return sb.toString();
    }

    private String generateTableBadSmells(List<AnalyzerResult> results, Collection<RuleId> ruleIds) {
        StringBuilder sb = new StringBuilder();
        sb.append("| ruleID | number | fixable |\n");
        sb.append("| --- | --- | --- |\n");
        for (var result : groupResultsById(results)) {
            sb.append(generateTableLine(ruleIds, result));
        }
        return sb.toString();
    }

    private List<Entry<RuleId, List<AnalyzerResult>>> groupResultsById(List<AnalyzerResult> results) {
        var result = new ArrayList<>(results.stream()
                .collect(Collectors.groupingBy(AnalyzerResult::ruleID))
                .entrySet());
        Collections.sort(result, (a, b) -> (b.getValue().size() - a.getValue().size()));

        return result;
    }

    private String generateTableLine(Collection<RuleId> ruleIds, Entry<RuleId, ? extends List<AnalyzerResult>> result) {
        return "| " + result.getKey().ruleID() + " | " + result.getValue().size() + " | "
                + result.getValue().stream().anyMatch(v -> ruleIds.contains(v.ruleID())) + " |\n";
    }
}
