package io.github.martinwitt.laughing_train;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLGenerator.Feature;
import io.github.martinwitt.laughing_train.domain.entity.AnalyzerResult;
import io.github.martinwitt.laughing_train.domain.value.RuleId;
import io.github.martinwitt.laughing_train.persistence.BadSmell;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import java.util.Collection;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import xyz.keksdose.spoon.code_solver.history.Change;

@ApplicationScoped
public class ChangelogPrinter {

  private static final ObjectMapper MAPPER =
      new ObjectMapper(new YAMLFactory().disable(Feature.WRITE_DOC_START_MARKER));

  @Inject MarkdownPrinter markdownPrinter;

  @Inject Config config;

  public String printChangeLog(List<? extends Change> changes) {
    StringBuilder sb = new StringBuilder();
    sb.append("## Changes: \n");
    for (var fix : changes) {
      sb.append("* " + fix.getChangeText().asMarkdown()).append("\n");
      if (fix.getAnalyzerResult() != null) {
        sb.append("<!-- ").append(toYaml(fix.getAnalyzerResult())).append(" -->\n");
        sb.append("<!-- fingerprint:").append(fix.getAnalyzerResult().hashCode()).append(" -->\n");
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

  public String printRepairedIssues(Collection<? extends Change> changes) {
    StringBuilder sb = new StringBuilder();
    sb.append("# Repairing Code Style Issues\n");
    sb.append("<!-- laughing-train-refactor -->\n");
    changes.stream()
        .map(Change::getBadSmell)
        .distinct()
        .forEach(
            v ->
                sb.append("## " + v.getName().asText() + "\n")
                    .append(v.getDescription().asMarkdown())
                    .append("\n"));
    return sb.toString();
  }

  public String printChangeLogShort(Collection<? extends Change> changes) {
    StringBuilder sb = new StringBuilder();
    sb.append("# Repairing Code Style Issues\n");
    var changesByBadSmell = changes.stream().collect(Collectors.groupingBy(Change::getBadSmell));
    for (var change : changesByBadSmell.entrySet()) {
      sb.append(
          "* %s".formatted(change.getKey().getName().asMarkdown())
              + " (%s)%n".formatted(change.getValue().size()));
    }
    return sb.toString();
  }

  private String generateTable(List<AnalyzerResult> results, Set<RuleId> ruleIds) {
    StringBuilder sb = new StringBuilder();
    sb.append("| ruleID | number | fixable |\n");
    sb.append("| --- | --- | --- |\n");
    for (var result :
        results.stream().collect(Collectors.groupingBy(AnalyzerResult::ruleID)).entrySet()) {
      sb.append(generateTableLine(ruleIds, result));
    }
    return sb.toString();
  }

  private String generateTableLine(
      Set<RuleId> ruleIds, Entry<RuleId, ? extends List<AnalyzerResult>> result) {
    return "| "
        + result.getKey()
        + " | "
        + result.getValue().size()
        + " | "
        + result.getValue().stream().anyMatch(v -> ruleIds.contains(v.ruleID()))
        + " |\n";
  }

  public String printBadSmellFingerPrints(List<? extends BadSmell> badSmells) {
    StringBuilder sb = new StringBuilder();
    for (BadSmell badSmell : badSmells) {
      sb.append("<!-- fingerprint:").append(badSmell.getIdentifier()).append(" -->\n");
    }
    return sb.toString();
  }
}
