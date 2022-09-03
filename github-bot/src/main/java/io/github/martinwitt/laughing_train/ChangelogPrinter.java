package io.github.martinwitt.laughing_train;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLGenerator.Feature;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.QodanaRules;
import xyz.keksdose.spoon.code_solver.api.analyzer.AnalyzerResult;
import xyz.keksdose.spoon.code_solver.history.Change;

@ApplicationScoped
public class ChangelogPrinter {

    private static final ObjectMapper MAPPER =
            new ObjectMapper(new YAMLFactory().disable(Feature.WRITE_DOC_START_MARKER));

    @Inject
    MarkdownPrinter markdownPrinter;

    @Inject
    Config config;

    String printChangeLog(List<Change> changes) {
        StringBuilder sb = new StringBuilder();
        sb.append("## Changes: \n");
        for (var fix : changes) {
            sb.append("* " + fix.getChangeText().asMarkdown()).append("\n");
            if (fix.getAnalyzerResult() != null) {
                sb.append("<!-- ").append(toYaml(fix.getAnalyzerResult())).append(" -->\n");
                sb.append("<!-- fingerprint:")
                        .append(fix.getAnalyzerResult().hashCode())
                        .append(" -->\n");
            }
        }
        return sb.toString();
    }

    private String toYaml(AnalyzerResult analyzerResult) {
        try {
            return MAPPER.writeValueAsString(analyzerResult);
        } catch (Exception e) {
            return "Could not serialize AnalyzerResult";
        }
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
                results.stream().filter(v -> ruleIds.contains(v.ruleID())).toList();
        StringBuilder sb = new StringBuilder();
        sb.append("# Bad smells\n");
        sb.append(String.format("I found %s bad smells:", activeRuleResults.size()))
                .append("\n");
        for (AnalyzerResult result : activeRuleResults) {

            sb.append("## ")
                    .append(result.ruleID())
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
