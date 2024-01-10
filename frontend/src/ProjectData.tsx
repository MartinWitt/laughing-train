import { gql } from '@apollo/client';
import { BadSmell } from './data/BadSmell';
import { Project } from './data/Project';

export const fetchProjectQuery = gql`
  query getProjects {
    getProjects {
      projectName
      projectUrl
      commits {
        commitHash
      }
    }
  }
`;
export const recentAnalyzerRuns = gql`
  query recentAnalyzerRuns {
    recentRuns(size: 30) {
      analyzerName
      commitHash
      numberOfIssues
      projectName
      projectUrl
      status
      timestamp
    }
  }
`;
export const recentRuns = gql`
  query recentRuns {
    recentRuns(size: 30) {
      analyzerName
      commitHash
      numberOfIssues
      projectName
      projectUrl
      status
      timestamp
    }
  }
`;
export const fetchAvailableRefactorings = gql`
  query getAvailableRefactorings {
    availableRefactorings {
      ruleId {
        id
      }
    }
  }
`;

export const fetchBadSmellsforHashQuery = gql`
  query getBadSmellsForHash($hash: String) {
    byCommitHash(commitHash: $hash) {
      identifier
      ruleID
      messageMarkdown
      snippet
      filePath
      position {
        startLine
      }
    }
  }
`;

export const addprojectQuery = gql`
  mutation addProject($projectName: String!, $projectUrl: String!) {
    addProject(projectName: $projectName, projectUrl: $projectUrl) {
      projectName
      projectUrl
    }
  }
`;
export const refactorQuery = gql`
  mutation refactor($badSmellIdentifier: [String]) {
    refactor(badSmellIdentifier: $badSmellIdentifier)
  }
`;
export const loginQuery = gql`
  query login($notNeeded: String) {
    login(notNeeded: $notNeeded)
  }
`;
export function filterDuplicates(params: Project[]) {
  return params;
}
export function filterDuplicateBadSmells(params: BadSmell[]) {
  if (params == null) {
    return [];
  }
  params = params.filter((badSmell) => {
    return badSmell.snippet != null;
  });
  const ids = params.map((o) => o.snippet);
  return params.filter(
    ({ snippet }, index) => !ids.includes(snippet, index + 1)
  );
}
export const getProject = gql`
  query getProject($projectName: String!) {
    getProjectWithName(projectName: $projectName) {
      projectName
      projectUrl
      commits {
        commitHash
      }
    }
  }
`;
