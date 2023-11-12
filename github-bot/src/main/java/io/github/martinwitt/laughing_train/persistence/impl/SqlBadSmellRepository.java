package io.github.martinwitt.laughing_train.persistence.impl;

import io.github.martinwitt.laughing_train.domain.value.RuleId;
import io.github.martinwitt.laughing_train.persistence.BadSmell;
import io.github.martinwitt.laughing_train.persistence.converter.BadSmellDaoConverter;
import io.github.martinwitt.laughing_train.persistence.dao.BadSmellDao;
import io.github.martinwitt.laughing_train.persistence.repository.BadSmellRepository;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import java.util.List;

@ApplicationScoped
@Transactional
public class SqlBadSmellRepository implements BadSmellRepository, PanacheRepository<BadSmellDao> {

  private static final BadSmellDaoConverter badSmellConverter = new BadSmellDaoConverter();

  @Override
  public List<BadSmell> findByRuleID(RuleId ruleID) {
    return find("ruleID", ruleID.id()).stream().map(badSmellConverter::convertToEntity).toList();
  }

  @Override
  public List<BadSmell> findByProjectName(String projectName) {
    return find("projectName", projectName).stream()
        .map(badSmellConverter::convertToEntity)
        .toList();
  }

  @Override
  public List<BadSmell> findByProjectUrl(String projectUrl) {
    return find("projectUrl", projectUrl).stream().map(badSmellConverter::convertToEntity).toList();
  }

  @Override
  public List<BadSmell> findByCommitHash(String commitHash) {
    return find("commitHash", commitHash).stream().map(badSmellConverter::convertToEntity).toList();
  }

  @Override
  public List<BadSmell> findByIdentifier(String identifier) {
    return find("identifier", identifier).stream().map(badSmellConverter::convertToEntity).toList();
  }

  @Override
  public List<BadSmell> findByCommitHash(String commitHash, String analyzerName) {
    return find("commitHash = ?1 and analyzer = ?2", commitHash, analyzerName).stream()
        .map(badSmellConverter::convertToEntity)
        .toList();
  }

  @Override
  public List<BadSmell> findByCommitHash(String commitHash, String analyzerName, String ruleId) {
    return find(
            "commitHash = ?1 and analyzer = ?2 and ruleID = ?3", commitHash, analyzerName, ruleId)
        .stream()
        .map(badSmellConverter::convertToEntity)
        .toList();
  }

  @Override
  public long deleteByIdentifier(String identifier) {
    return delete("identifier", identifier);
  }

  @Override
  public BadSmell save(BadSmell badSmell) {
    if (find("identifier", badSmell.getIdentifier()).stream().findAny().isEmpty()) {
      persist(badSmellConverter.convertToDao(badSmell));
    }
    return badSmell;
  }
}
