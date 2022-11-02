package xyz.keksdose.spoon.code_solver.api.analyzer;

import io.github.martinwitt.laughing_train.api.RuleId;
import java.io.Serializable;
import javax.annotation.Nonnull;

/**
 * This represents a single issue of an analyzer run. It contains the position of the issue in the source file, the message and the message in markdown format.
 */
public interface AnalyzerResult extends Serializable {

    String getAnalyzer();

    @Nonnull
    public RuleId ruleID();

    public String filePath();

    public Position position();

    public String message();

    public String messageMarkdown();

    public String snippet();
}
