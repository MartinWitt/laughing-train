package io.github.martinwitt.laughing_train.domain.value;

import java.io.Serializable;

/** This is the id of a rule. It is used to identify rules of a static analyzer. */
public record RuleId(String id) implements Serializable {

  public RuleId {
    if (id == null || id.isBlank()) {
      throw new IllegalArgumentException("id must not be blank");
    }
  }
}
