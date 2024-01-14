package io.github.martinwitt.laughing_train.persistence.impl;

import static org.junit.jupiter.api.Assertions.*;

import io.github.martinwitt.laughing_train.persistence.BadSmell;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.instancio.Instancio;
import org.junit.jupiter.api.Test;

@QuarkusTest
class SqlCodeIssueRepositoryTest {

  @Inject SqlBadSmellRepository sqlBadSmellRepository;

  @Test
  void findByRuleID() {
    BadSmell badSmell = Instancio.create(BadSmell.class);
    sqlBadSmellRepository.save(badSmell);
    assertEquals(1, sqlBadSmellRepository.findByRuleID(badSmell.ruleID()).size());
    assertEquals(
        sqlBadSmellRepository.findByRuleID(badSmell.ruleID()).getFirst().position(),
        badSmell.position());
  }
}
