package io.github.martinwitt.laughing_train.mining;

import com.google.common.flogger.FluentLogger;
import io.github.martinwitt.laughing_train.Config;
import io.github.martinwitt.laughing_train.MarkdownPrinter;
import io.github.martinwitt.laughing_train.api.RuleId;
import io.github.martinwitt.laughing_train.data.Project;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.diff.RawTextComparator;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.QodanaRules;
import xyz.keksdose.spoon.code_solver.api.analyzer.AnalyzerResult;

@ApplicationScoped
public class MiningPrinter {
    private static final FluentLogger logger = FluentLogger.forEnclosingClass();

    @Inject
    MarkdownPrinter markdownPrinter;

    @Inject
    Config config;

    public String printAllResults(List<AnalyzerResult> results, Project project) {
        StringBuilder sb = new StringBuilder();
        Set<RuleId> ruleIds =
                config.getRules().keySet().stream().map(QodanaRules::getRuleId).collect(Collectors.toSet());
        long fixableRules =
                results.stream().filter(v -> ruleIds.contains(v.ruleID())).count();
        sb.append("\n# Bad smells\n");
        sb.append(String.format("I found %s bad smells with %s repairable:", results.size(), fixableRules))
                .append("\n");
        sb.append(generateTableBadSmells(results, ruleIds));
        // var blameTable = calculateGtBlameForIssues(results, project);
        // sb.append(generateBlameTable(blameTable));
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
                        .append(markdownPrinter.toJavaMarkdownBlock(result.snippet()))
                        .append("\n");
                // sb.append("#### Blame");
                // if (blameTable.containsKey(result)) {
                //    .append("\n")
                //    .append(blameTable
                //            .get(result)
                //            .commit()
                //            .abbreviate(7)
                //            .name())
                //    .append(" ")
                //    .append(blameTable.get(result).person().getName())
                //    .append("\n");
                // }
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
        var grouped = map.values().stream()
                .collect(Collectors.groupingBy(v -> v.person().getName()));
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

    private String generateTableBadSmells(List<AnalyzerResult> results, Set<RuleId> ruleIds) {
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

    private String generateTableLine(Set<RuleId> ruleIds, Entry<RuleId, List<AnalyzerResult>> result) {
        return "| " + result.getKey() + " | " + result.getValue().size() + " | "
                + result.getValue().stream().anyMatch(v -> ruleIds.contains(v.ruleID())) + " |\n";
    }

    private Map<AnalyzerResult, PersonAndCommit> calculateGtBlameForIssues(
            List<AnalyzerResult> results, Project projectQodana) {
        logger.atInfo().log("Calculating blame for %d issues", results.size());
        Map<AnalyzerResult, PersonAndCommit> blameMap = new HashMap<>();
        try (Git git = Git.open(projectQodana.folder())) {
            for (AnalyzerResult analyzerResult : results) {
                var gitBlame = git.blame()
                        .setFilePath(analyzerResult.filePath())
                        .setTextComparator(RawTextComparator.WS_IGNORE_ALL)
                        .call();
                if (gitBlame == null) {
                    logger.atSevere().log("Git blame is null for %s", analyzerResult.filePath());
                    continue;
                }
                gitBlame.computeRange(
                        analyzerResult.position().startLine(),
                        analyzerResult.position().endLine());
                var person = gitBlame.getSourceAuthor(analyzerResult.position().startLine());
                var commit = gitBlame.getSourceCommit(analyzerResult.position().startLine());
                if (person != null && commit != null) {
                    blameMap.put(analyzerResult, new PersonAndCommit(person, commit));
                }
            }
        } catch (Exception e) {
            logger.atSevere().withCause(e).log("Error while calculating blame");
        }
        return blameMap;
    }
}
