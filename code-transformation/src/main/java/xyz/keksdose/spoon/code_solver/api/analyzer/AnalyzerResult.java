package xyz.keksdose.spoon.code_solver.api.analyzer;

import java.io.Serializable;
import javax.annotation.Nonnull;

/**
 * This represents a single issue of an analyzer run. It contains the position of the issue in the source file, the message and the message in markdown format.
 */
public interface AnalyzerResult extends Serializable {

    String getAnalyzer();

    @Nonnull
    public String ruleID();

    public String filePath();

    abstractPosition position();

    abstractString message();

    public String messageMarkdown();

    abstractString snippet();
}
