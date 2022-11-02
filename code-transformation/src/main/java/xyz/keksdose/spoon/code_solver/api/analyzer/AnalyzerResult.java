package xyz.keksdose.spoon.code_solver.api.analyzer;

import io.github.martinwitt.laughing_train.domain.value.RuleId;
import java.io.Serializable;
import javax.annotation.Nonnull;

/**
 * This represents a single issue of an analyzer run. It contains the position of the issue in the source file, the message and the message in markdown format.
 */
public interface AnalyzerResult extends Serializable {

    String getAnalyzer();

    @Nonnull
    RuleId ruleID();

    String filePath();

    Position position();

    String message();

    String messageMarkdown();

    String snippet();
}
