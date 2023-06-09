package xyz.keksdose.spoon.code_solver.analyzer.spoon;

import io.github.martinwitt.laughing_train.domain.entity.AnalyzerResult;
import io.github.martinwitt.laughing_train.domain.value.Position;
import io.github.martinwitt.laughing_train.domain.value.RuleId;
import java.util.Objects;

public class SpoonAnalyzerResult implements AnalyzerResult {

    private static final String ANALYZER = "SpoonAnalyzer";
    private final RuleId ruleId;
    private final String filePath;
    private final Position position;
    private final String message;
    private final String messageMarkdown;
    private final String snippet;

    public SpoonAnalyzerResult(
            RuleId ruleId, String filePath, Position position, String message, String messageMarkdown, String snippet) {
        this.ruleId = ruleId;
        this.filePath = filePath;
        this.position = position;
        this.message = message;
        this.messageMarkdown = messageMarkdown;
        this.snippet = snippet;
    }

    @Override
    public String getAnalyzer() {
        return ANALYZER;
    }

    @Override
    public RuleId ruleID() {
        return ruleId;
    }

    @Override
    public String filePath() {
        return filePath;
    }

    @Override
    public Position position() {
        return position;
    }

    @Override
    public String message() {
        return message;
    }

    @Override
    public String messageMarkdown() {
        return messageMarkdown;
    }

    @Override
    public String snippet() {
        return snippet;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleId, filePath, position, message, messageMarkdown, snippet);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpoonAnalyzerResult)) {
            return false;
        }
        SpoonAnalyzerResult other = (SpoonAnalyzerResult) obj;
        return Objects.equals(ruleId, other.ruleId)
                && Objects.equals(filePath, other.filePath)
                && Objects.equals(position, other.position)
                && Objects.equals(message, other.message)
                && Objects.equals(messageMarkdown, other.messageMarkdown)
                && Objects.equals(snippet, other.snippet);
    }
}
