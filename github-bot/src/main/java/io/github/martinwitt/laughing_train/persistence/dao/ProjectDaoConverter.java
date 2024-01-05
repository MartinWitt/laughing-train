package io.github.martinwitt.laughing_train.persistence.dao;

import io.github.martinwitt.laughing_train.domain.entity.GitHubCommit;
import io.github.martinwitt.laughing_train.domain.entity.RemoteProject;
import io.github.martinwitt.laughing_train.persistence.converter.DaoConverter;
import java.util.List;

public class ProjectDaoConverter implements DaoConverter<RemoteProject, ProjectDao> {

  @Override
  public ProjectDao convertToDao(RemoteProject entity) {
    ProjectDao dao = new ProjectDao();
    dao.setProjectName(entity.getProjectName());
    dao.setProjectUrl(entity.getProjectUrl());
    dao.setCommits(convertCommitsToDao(entity.getCommits()));
    return dao;
  }

  private List<GitHubCommitDao> convertCommitsToDao(List<? extends GitHubCommit> commits) {
    return commits.stream().map(this::createGitHubCommitDao).toList();
  }

  private GitHubCommitDao createGitHubCommitDao(GitHubCommit commit) {
    GitHubCommitDao dao = new GitHubCommitDao();
    dao.setCommitHash(commit.getCommitHash());
    return dao;
  }

  @Override
  public RemoteProject convertToEntity(ProjectDao projectDao) {
    RemoteProject remoteProject =
        new RemoteProject(projectDao.getProjectName(), projectDao.getProjectUrl());
    for (GitHubCommitDao commitDao : projectDao.getCommits()) {
      GitHubCommit gitHubCommitInstance = new GitHubCommit();
      gitHubCommitInstance.setCommitHash(commitDao.getCommitHash());
      remoteProject.addCommitHash(gitHubCommitInstance);
    }
    return remoteProject;
  }
}
