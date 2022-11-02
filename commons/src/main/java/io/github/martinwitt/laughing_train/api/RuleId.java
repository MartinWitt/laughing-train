package io.github.martinwitt.laughing_train.api;

import java.io.Serializable;

/**
 * This is the id of a rule. It is used to identify rules of a static analyzer.
 */
public record RuleId(String ruleID) implements Serializable {

    public RuleId {
        if (ruleID == null || ruleID.isBlank()) {
            throw new IllegalArgumentException("ruleID must not be blank");
        }
    }
}
