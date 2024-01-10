import { GitHubCommit } from './GitHubCommit';

export type Project = {
  projectName: string;
  projectUrl: string;
  commits: GitHubCommit[];
};
