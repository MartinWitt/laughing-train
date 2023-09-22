package io.github.martinwitt.laughing_train.domain.entity;

import io.github.martinwitt.laughing_train.domain.value.Position;
import io.github.martinwitt.laughing_train.domain.value.RuleId;
import java.io.Serializable;

/**
 * This represents a single issue of an analyzer run. It contains the position of the issue in the
 * source file, the message and the message in markdown format.
 */
public interface AnalyzerResult extends Serializable {

  String getAnalyzer();

  RuleId ruleID();

  String filePath();

  Position position();

  String message();

  String messageMarkdown();

  String snippet();
}
