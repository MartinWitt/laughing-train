import { gql} from '@apollo/client';
import { BadSmell } from './data/BadSmell';
import { Project } from './data/Project';





export const fetchProjectQuery = gql`
  query getProjects {
   getProjects {
   projectName
   projectUrl
   commitHashes
   }
}
`;

export const fetchBadSmellsforHashQuery = gql`
  query getBadSmellsForHash($hash: String) {
  byCommitHash(commitHash: $hash) {
    id
    ruleID
    messageMarkdown
    snippet
    filePath
  }
}
`;
export function filterDuplicates(params:Project[]) {
  params = params.filter((project) => {
    return project.commitHashes != null && project.commitHashes.length > 0;
  });
  const ids = params.map(o => o.projectUrl)
  const filtered = params.filter(({ projectUrl }, index) => !ids.includes(projectUrl, index + 1));
  return filtered;
}
export function filterDuplicateBadSmells(params: BadSmell[]) {
  if (params == null) {
    return [];
  }
  params = params.filter((badSmell) => {
    return badSmell.snippet != null;
  });
  const ids = params.map(o => o.snippet)
  const filtered = params.filter(({ snippet }, index) => !ids.includes(snippet, index + 1));
  return filtered;
}

