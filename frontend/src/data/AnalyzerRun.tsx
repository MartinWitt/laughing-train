import { LocalDateTime } from '@js-joda/core';

export type AnalyzerRun = {
  analyzerName: String;
  commitHash: String;
  localDateTime: LocalDateTime;
  numberOfIssues: number;
  projectName: String;
  projectUrl: String;
  status: String;
};
