package io.github.martinwitt.laughing_train.summary;

import io.github.martinwitt.laughing_train.domain.entity.RemoteProject;
import io.github.martinwitt.laughing_train.domain.value.RuleId;
import io.github.martinwitt.laughing_train.persistence.BadSmell;
import io.github.martinwitt.laughing_train.persistence.repository.BadSmellRepository;
import io.github.martinwitt.laughing_train.persistence.repository.ProjectRepository;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.QodanaRules;

@ApplicationScoped
public class GetFixableBadSmells {

  ProjectRepository projectRepository;

  BadSmellRepository badSmellRepository;

  GetFixableBadSmells(ProjectRepository projectRepository, BadSmellRepository badSmellRepository) {
    this.projectRepository = projectRepository;
    this.badSmellRepository = badSmellRepository;
  }

  /**
   * Returns a map of all projects and their fixable bad smells. A bad smell is fixable if there is
   * a refactoring available.
   *
   * @return Map of all projects and their fixable bad smells.
   */
  public Map<RemoteProject, List<BadSmell>> getFixableBadSmells() {
    List<RemoteProject> allProjects = getAllProjects();
    return allProjects.stream()
        .filter(v -> !v.getCommitHashes().isEmpty())
        .collect(
            Collectors.toMap(
                project -> project,
                project -> getFixableBadSmells(getNewestHash(project).orElse(""))));
  }

  /**
   * Returns a list of all fixable bad smells of a project. A bad smell is fixable if there is a
   * refactoring available.
   *
   * @param project Project to get the fixable bad smells from.
   * @return List of all fixable bad smells of a project.
   */
  public List<BadSmell> getFixableBadSmells(RemoteProject project) {
    return getFixableBadSmells(project, getNewestHash(project).orElse(""));
  }

  /**
   * Returns a list of all fixable bad smells of a project. A bad smell is fixable if there is a
   * refactoring available.
   *
   * @param project Project to get the fixable bad smells from.
   * @return List of all fixable bad smells of a project.
   */
  public List<BadSmell> getFixableBadSmells(RemoteProject project, String commitHash) {
    return getFixableBadSmells(commitHash);
  }

  /**
   * Returns a list of all projects.
   *
   * @return List of all projects.
   */
  private List<RemoteProject> getAllProjects() {
    return projectRepository.getAll();
  }

  /**
   * Returns the newest commit hash of a project.
   *
   * @param project Project to get the newest commit hash from.
   * @return Newest commit hash of the project.
   */
  private Optional<String> getNewestHash(RemoteProject project) {
    if (project.getCommitHashes().isEmpty()) {
      return Optional.empty();
    }
    return Optional.of(project.getCommitHashes().get(project.getCommitHashes().size() - 1));
  }

  private List<BadSmell> getFixableBadSmells(String commitHash) {
    Set<String> ruleIDs = getAllQodanaRules();

    List<BadSmell> allBadSmells = badSmellRepository.findByCommitHash(commitHash);
    return allBadSmells.stream()
        .filter(badSmell -> ruleIDs.contains(badSmell.ruleID().id()))
        .collect(Collectors.toList());
  }

  /**
   * Returns all Qodana rules. There are only fixable bad smells for Qodana rules included in this
   * set.
   *
   * @return Set of all Qodana rules.
   */
  private Set<String> getAllQodanaRules() {
    EnumSet<QodanaRules> rules = EnumSet.allOf(QodanaRules.class);
    return rules.stream().map(QodanaRules::getRuleId).map(RuleId::id).collect(Collectors.toSet());
  }
}
