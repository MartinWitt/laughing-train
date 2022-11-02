package io.github.martinwitt.laughing_train.domain.value;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

class RuleIdTest {
    @Test
    void testRuleIDCorrect() {
        assertThat(new RuleId("ruleID")).isNotNull();
        assertThat(new RuleId("ruleID")).extracting(v -> v.ruleID()).isEqualTo("ruleID");
    }

    @Test
    void testNullValue() {
        assertThatThrownBy(() -> new RuleId(null)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void testEmptyValue() {
        assertThatThrownBy(() -> new RuleId("")).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void testBlankValue() {
        assertThatThrownBy(() -> new RuleId("   ")).isInstanceOf(IllegalArgumentException.class);
    }
}
