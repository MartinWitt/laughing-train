package io.github.martinwitt.laughing_train;

import java.util.Collection;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import xyz.keksdose.spoon.code_solver.history.Change;

@ApplicationScoped
public class ChangelogPrinter {

    @Inject
    private MarkdownPrinter markdownPrinter;

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
}
