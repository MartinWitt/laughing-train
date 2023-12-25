package io.github.martinwitt.laughing_train.mining;

import io.github.martinwitt.laughing_train.domain.entity.AnalyzerStatus;
import io.github.martinwitt.laughing_train.domain.entity.GitHubCommit;
import io.github.martinwitt.laughing_train.mining.api.AnalyzerRunDao;
import io.github.martinwitt.laughing_train.persistence.converter.DaoConverter;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AnalyzerRunConverter implements DaoConverter<GitHubCommit, List<AnalyzerRunDao>> {
  @Override
  public List<AnalyzerRunDao> convertToDao(GitHubCommit entity) {
    List<AnalyzerRunDao> list = new ArrayList<>();
    for (AnalyzerStatus analyzerStatus : entity.getAnalyzerStatuses()) {
      AnalyzerRunDao dao = new AnalyzerRunDao();
      dao.analyzerName = analyzerStatus.getAnalyzerName();
      dao.status = analyzerStatus.getStatus().name();
      dao.numberOfIssues = analyzerStatus.getNumberOfIssues();
      dao.commitHash = entity.getCommitHash();
      dao.localDateTime = LocalDateTime.parse(analyzerStatus.getLocalDateTime());
      list.add(dao);
    }
    return list;
  }

  @Override
  public GitHubCommit convertToEntity(List<AnalyzerRunDao> dao) {
    String commitHash = dao.getFirst().commitHash;
    List<AnalyzerStatus> analyzerStatuses = new ArrayList<>();
    for (AnalyzerRunDao analyzerRunDao : dao) {
      if (analyzerRunDao.status.equals("SUCCESS")) {
        analyzerStatuses.add(
            new AnalyzerStatus(
                analyzerRunDao.analyzerName,
                AnalyzerStatus.Status.SUCCESS,
                analyzerRunDao.numberOfIssues,
                analyzerRunDao.commitHash,
                analyzerRunDao.localDateTime));
      } else if (analyzerRunDao.status.equals("FAILURE")) {
        analyzerStatuses.add(
            new AnalyzerStatus(
                analyzerRunDao.analyzerName,
                AnalyzerStatus.Status.FAILURE,
                analyzerRunDao.numberOfIssues,
                analyzerRunDao.commitHash,
                analyzerRunDao.localDateTime));
      }
    }
    return new GitHubCommit(commitHash, analyzerStatuses);
  }
}
