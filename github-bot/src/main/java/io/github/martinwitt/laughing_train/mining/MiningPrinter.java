package io.github.martinwitt.laughing_train.mining;

import io.github.martinwitt.laughing_train.Config;
import io.github.martinwitt.laughing_train.MarkdownPrinter;
import io.github.martinwitt.laughing_train.data.Project;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import org.eclipse.jgit.api.Git;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.QodanaRules;
import xyz.keksdose.spoon.code_solver.api.analyzer.AnalyzerResult;

@ApplicationScoped
public class MiningPrinter {
    @Inject
    MarkdownPrinter markdownPrinter;

    @Inject
    Config config;

    public String printAllResults(List<AnalyzerResult> results, Map<AnalyzerResult, PersonAndCommit> map) {
        StringBuilder sb = new StringBuilder();
        Set<String> ruleIds =
                config.getRules().keySet().stream().map(QodanaRules::getRuleId).collect(Collectors.toSet());
        long fixableRules =
                results.stream().filter(v -> ruleIds.contains(v.ruleID())).count();
        sb.append("# Bad smells\n");
        sb.append(String.format("I found %s bad smells with %s repairable:", results.size(), fixableRules))
                .append("\n");
        sb.append(generateTableBadSmells(results, ruleIds));
        sb.append(generateBlameTable(map));
        var grouped = results.stream().collect(Collectors.groupingBy(AnalyzerResult::ruleID));
        for (var groupedResult : grouped.entrySet()) {
            sb.append("## ").append(groupedResult.getKey()).append("\n");
            for (AnalyzerResult result : groupedResult.getValue()) {
                sb.append("### ")
                        .append(result.ruleID())
                        .append("\n")
                        .append(result.messageMarkdown())
                        .append("\n")
                        .append("in ")
                        .append(markdownPrinter.toMarkdown(result.filePath()))
                        .append("\n")
                        .append("#### Snippet")
                        .append("\n")
                        .append(markdownPrinter.toJavaMarkdownBlock(result.snippet()));
            }
        }
        return sb.toString();
    }

    private String generateBlameTable(Map<AnalyzerResult, PersonAndCommit> map) {
        StringBuilder sb = new StringBuilder();
        sb.append("## Blame\n");
        sb.append("Bad smells by person and commit(**DO NOT SEE THIS AS ANY ATTACK**):\n");
        sb.append("| Person | Bad Smells | \n");
        sb.append("| --- | --- | \n");
        var grouped = map.values().stream().collect(Collectors.groupingBy(PersonAndCommit::person));
        for (var groupedResult : grouped.entrySet()) {
            sb.append("| ")
                    .append(groupedResult.getKey())
                    .append(" | ")
                    .append(groupedResult.getValue().size())
                    .append(" | \n");
        }
        sb.append("\n");
        return sb.toString();
    }

    private String generateTableBadSmells(List<AnalyzerResult> results, Set<String> ruleIds) {
        StringBuilder sb = new StringBuilder();
        sb.append("| ruleID | number | fixable |\n");
        sb.append("| --- | --- | --- |\n");
        for (var result : groupResultsById(results)) {
            sb.append(generateTableLine(ruleIds, result));
        }
        return sb.toString();
    }

    private List<Entry<String, List<AnalyzerResult>>> groupResultsById(List<AnalyzerResult> results) {
        var result = new ArrayList<>(results.stream()
                .collect(Collectors.groupingBy(AnalyzerResult::ruleID))
                .entrySet());
        Collections.sort(
                result,
                ((Comparator<? super Entry<String, List<AnalyzerResult>>>)
                                (a, b) -> (b.getValue().size() - a.getValue().size()))
                        .reversed());
        return result;
    }

    private String generateTableLine(Set<String> ruleIds, Entry<String, List<AnalyzerResult>> result) {
        return "| " + result.getKey() + " | " + result.getValue().size() + " | "
                + result.getValue().stream().anyMatch(v -> ruleIds.contains(v.ruleID())) + " |\n";
    }

    Map<AnalyzerResult, PersonAndCommit> calculateGtBlameForIssues(
            List<AnalyzerResult> results, Project projectQodana) {
        PeriodicMiner.logger.atInfo().log("Calculating blame for %d issues", results.size());
        Map<AnalyzerResult, PersonAndCommit> blameMap = new HashMap<>();
        try (Git git = Git.open(projectQodana.folder())) {
            for (AnalyzerResult analyzerResult : results) {
                var gitBlame =
                        git.blame().setFilePath(analyzerResult.filePath()).call();
                if (gitBlame == null) {
                    PeriodicMiner.logger.atSevere().log("Git blame is null for %s", analyzerResult.filePath());
                    continue;
                }
                int medianLine = analyzerResult.position().startLine()
                        + (analyzerResult.position().endLine()
                                        - analyzerResult.position().startLine())
                                / 2;
                gitBlame.computeRange(
                        analyzerResult.position().startLine(),
                        analyzerResult.position().endLine());
                var person = gitBlame.getSourceAuthor(medianLine);
                var commit = gitBlame.getSourceCommit(medianLine);
                if (person != null && commit != null) {
                    blameMap.put(analyzerResult, new PersonAndCommit(person, commit));
                    System.out.println(person);
                    System.out.println(commit);
                }
            }
        } catch (Exception e) {
            PeriodicMiner.logger.atSevere().withCause(e).log("Error while calculating blame");
        }
        return blameMap;
    }
}
