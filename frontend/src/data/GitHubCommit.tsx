import { AnalyzerStatus } from './AnalyzerStatus';

export type GitHubCommit = {
  analyzerStatuses: AnalyzerStatus[];
  commitHash: String;
};
