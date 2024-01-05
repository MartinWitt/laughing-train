package io.github.martinwitt.laughing_train.mining;

import io.github.martinwitt.laughing_train.mining.api.AnalyzerRunDao;
import io.github.martinwitt.laughing_train.persistence.converter.DaoConverter;

public class AnalyzerRunConverter implements DaoConverter<AnalyzerRun, AnalyzerRunDao> {

  @Override
  public AnalyzerRunDao convertToDao(AnalyzerRun entity) {
    AnalyzerRunDao analyzerRunDao = new AnalyzerRunDao();
    analyzerRunDao.projectUrl = entity.getProjectUrl();
    analyzerRunDao.projectName = entity.getProjectName();
    analyzerRunDao.analyzerName = entity.getAnalyzerName();
    analyzerRunDao.status = entity.getStatus().name();
    analyzerRunDao.numberOfIssues = entity.getNumberOfIssues();
    analyzerRunDao.commitHash = entity.getCommitHash();
    analyzerRunDao.localDateTime = entity.getLocalDateTime();
    return analyzerRunDao;
  }

  @Override
  public AnalyzerRun convertToEntity(AnalyzerRunDao dao) {
    return new AnalyzerRun(
        dao.projectName,
        dao.projectUrl,
        dao.analyzerName,
        dao.status,
        dao.numberOfIssues,
        dao.commitHash,
        dao.localDateTime);
  }
}
